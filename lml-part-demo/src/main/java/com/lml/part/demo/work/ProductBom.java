package com.lml.part.demo.work;

import org.apache.commons.lang3.tuple.Pair;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shuishan
 * @date 2020/6/1
 */
public class ProductBom {

    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        StockProductGoodVo vo = new StockProductGoodVo();
        vo.setNum(6);

        Map<Pair<Long, Long>, Integer> bomProductGoodsNum = new HashMap<>();
        bomProductGoodsNum.put(Pair.of(1111L, 0L), 4);

        Map<Pair<Long, Long>, Integer> pickedNumMap = new HashMap<>();
        pickedNumMap.put(Pair.of(1111L, 0L), 5);
        pickedNumMap.put(Pair.of(2222L, 0L), 1);

        int good = computeProductGoodUpdateNum(vo, bomProductGoodsNum, pickedNumMap);
        Pair<Long, Long> key = Pair.of(1111L, 0L);
        System.out.println("成品数:" + good + "    ;原料扣减数:" + bomProductGoodsNum.get(key) + "  ;拣选扣减后:" + pickedNumMap.get(key));
    }


    /**
     * 返回合成的成品数量
     * 根据换货比例bom来计算出数量信息，同时更新原料实际实际扣减数
     */
    private static Integer computeProductGoodUpdateNum(StockProductGoodVo productGoodVo, Map<Pair<Long, Long>, Integer> bomProductGoodsNum, Map<Pair<Long, Long>, Integer> pickedNumMap) {
        if (bomProductGoodsNum.isEmpty() || pickedNumMap.isEmpty()) return 0;
        //仅支持1条原料合成计算
        if (bomProductGoodsNum.size() > 1) return 0;
        Pair<Long, Long> materialKey = null;
        Integer materialNum = null;
        for (Map.Entry<Pair<Long, Long>, Integer> entry : bomProductGoodsNum.entrySet()) {
            materialKey = entry.getKey();
            materialNum = entry.getValue();
        }
        if (materialNum > productGoodVo.getNum()) {
            //原料大于成品数量
            int remain = materialNum % productGoodVo.getNum();
            if (remain == 0) {
                //按比例扣减
                int ratio = materialNum / productGoodVo.getNum();
                int pickedNum = Math.min(pickedNumMap.get(materialKey), materialNum);
                //合成数
                int goodNum = pickedNum / ratio;
                if (goodNum == 0) {
                    return 0;
                }
                int materialUseNum = goodNum * ratio;
                //计算扣减原料数量
                bomProductGoodsNum.put(materialKey, materialUseNum);
                // 减掉使用的原料数
                pickedNumMap.merge(materialKey, materialUseNum, (old, value) -> old - value);
                return goodNum;
            } else {
                //按数量扣减
                int pickedNum = pickedNumMap.get(materialKey);
                if (pickedNum < materialNum) {
                    return 0;
                }
                // 减掉使用的原料数
                pickedNumMap.merge(materialKey, materialNum, (old, value) -> old - value);
                return productGoodVo.getNum();
            }
        } else {
            //原料小于成品数量
            int remain = productGoodVo.getNum() % materialNum;
            if (remain == 0) {
                //按比例扣减
                int ratio = productGoodVo.getNum() / materialNum;
                int pickedNum = Math.min(pickedNumMap.get(materialKey), materialNum);
                if (pickedNum < 0) {
                    return 0;
                }
                //计算扣减原料数量
                bomProductGoodsNum.put(materialKey, pickedNum);
                // 减掉使用的原料数
                pickedNumMap.merge(materialKey, pickedNum, (old, value) -> old - value);
                return pickedNum * ratio;
            } else {
                //按数量扣减
                int pickedNum = pickedNumMap.get(materialKey);
                if (pickedNum < materialNum) {
                    return 0;
                }
                // 减掉使用的原料数
                pickedNumMap.merge(materialKey, materialNum, (old, value) -> old - value);
                return productGoodVo.getNum();
            }
        }
    }
}
