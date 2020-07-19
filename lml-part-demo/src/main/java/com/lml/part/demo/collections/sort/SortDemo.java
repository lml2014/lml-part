package com.lml.part.demo.collections.sort;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author shuishan
 * @date 2020/5/14
 */
public class SortDemo {

    public static void main(String[] args) {
        List<WaveSortingDetail> details = new ArrayList<>();
        details.add(build(1L, 2L, 2));
        details.add(build(2L, 1L, 2));
        details.add(build(3L, 2L, 0));
        details.add(build(4L, 1L, 0));

        Comparator<WaveSortingDetail> sortingId = (s1, s2) -> {
            System.out.println("sortId:" + s1.getId() + ";" + s2.getId());
            if (s1.getSortingId() == s2.getSortingId()) {
                return 0;
            }
            if (s1.getSortingId() == 1L) {
                return -1;
            } else if (s2.getSortingId() == 1L) {
                return 1;
            }
            return 0;
        };
//        Comparator<WaveSortingDetail> matched = Comparator.comparing(WaveSortingDetail::getMatchedNum).reversed();
        Comparator<WaveSortingDetail> matched = (d1, d2) -> {
            System.out.println("matchedId:" + d1.getId() + ";" + d2.getId());
            return d1.getMatchedNum().compareTo(d2.getMatchedNum());
        };
        matched = matched.reversed();
        Comparator comparator = sortingId.thenComparing(matched);
        details.sort(comparator);
        System.out.println(JSON.toJSONString(details));
        System.out.println(JSON.toJSONString(details.stream().map(WaveSortingDetail::getId).collect(Collectors.toList())));
        //2  4  1   3

    }

    private static WaveSortingDetail build(Long id, Long sortingId, Integer matchedNum) {
        WaveSortingDetail detail = new WaveSortingDetail();
        detail.setId(id);
        detail.setSortingId(sortingId);
        detail.setMatchedNum(matchedNum);
        return detail;
    }
}
