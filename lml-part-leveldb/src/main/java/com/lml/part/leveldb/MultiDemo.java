package com.lml.part.leveldb;

import org.iq80.leveldb.DB;
import org.iq80.leveldb.Options;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.fusesource.leveldbjni.JniDBFactory.factory;

/**
 * @author shuishan
 * @date 2020/3/10
 */
public class MultiDemo {

    public static void main(String[] args) throws Exception {
        DB db = openDb();
        Thread.sleep(10000);
        DB db1 = openDb();
        Thread.sleep(10000);

    }

    public static DB openDb() throws IOException {
        String path = Demo.class.getResource("/").getPath() + "example";
        File file = new File(path);
        System.out.println("path:" + path);

        Options options = new Options();
        options.createIfMissing(true);
//        options.logger(System.out::println);
        options.cacheSize(100 * 1048576); // 100MB cache
        long start = System.currentTimeMillis();
        DB db = factory.open(file, options);
        System.out.println("start took:" + (System.currentTimeMillis() - start));
        return db;
    }
}
