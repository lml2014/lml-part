package com.lml.part.demo.work;

import java.util.List;

/**
 * @Author shuishan
 * @Date 2019-09-03
 **/
public class StockProductGoodVo {

    private Integer num;

    /**
     * 加工单拣选波次Id
     */
    private Long waveId;


    /**
     * 供应商Id，已售采购和智能采购生成加工单使用
     */
    private Long supplierId;

    public Long getWaveId() {
        return waveId;
    }

    public void setWaveId(Long waveId) {
        this.waveId = waveId;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
