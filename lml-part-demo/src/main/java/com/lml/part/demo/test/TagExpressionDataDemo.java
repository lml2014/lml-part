package com.lml.part.demo.test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;

/**
 * @author shuishan
 * @date 2020/4/17
 */
public class TagExpressionDataDemo {

    public static void main(String[] args) {
        TagExpressionData data = new TagExpressionData("aaa");
        data.setTagExpression("stock.upload || stock.status.download.excel || items.sync.map || items.down.sync || stock.status.download.excel || items.record.download.excel || export.stock.upload.log || export.item.list || packma.item.alarm.message || packma.item.alarm.message || items.importing");
        System.out.println(data.matchTags("items.excel.importing"));

//        CompletableFuture.supplyAsync();
//        CountDownLatch
    }
}
