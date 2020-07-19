package com.lml.part.leveldb;

import static org.fusesource.leveldbjni.JniDBFactory.*;

import org.iq80.leveldb.*;

import java.io.File;
import java.io.IOException;

/**
 * @author shuishan
 * @date 2020/3/9
 */
public class Demo {

    public static void main(String[] args) throws IOException {
        String path = Demo.class.getResource("/").getPath() + "example";
        File file = new File(path);
        System.out.println("path:" + path);

        Options options = new Options();
        options.createIfMissing(true);
//        options.logger(System.out::println);
        options.cacheSize(100 * 1048576); // 100MB cache

        DB db = openDb(file, options);

        putGet(db);

        batchPerform(db);

        iterator(db);

        workSnapshot(db);

        approximate(db);

        batchMatchData(db);

        dbStatus(db);

        db.close();
//        factory.destroy(file, options);
    }

    public static DB openDb(File file, Options options) throws IOException {
        long start = System.currentTimeMillis();
        DB db = factory.open(file, options);
        System.out.println("start took:" + (System.currentTimeMillis() - start));
        return db;
    }

    public static void putGet(DB db) {
        String name = "name";
        db.put(bytes(name), bytes("zhangsan11"));
        String value = asString(db.get(bytes("name")));
        System.out.println("save name:" + value);
        db.delete(bytes(name));
        System.out.println("delete name:" + name);
    }

    public static void batchPerform(DB db) throws IOException {
        try (WriteBatch batch = db.createWriteBatch()) {
            batch.delete(bytes("Denver"));
            batch.put(bytes("Tampa"), bytes("green"));
            batch.put(bytes("London"), bytes("red"));
            db.write(batch);
        }
        System.out.println("get batch save tampa:" + asString(db.get(bytes("Tampa"))));
        System.out.println("get batch save London:" + asString(db.get(bytes("London"))));
    }

    public static void iterator(DB db) throws IOException {
        DBIterator iterator = db.iterator();
        try {
            for (iterator.seekToFirst(); iterator.hasNext(); iterator.next()) {
                String key = asString(iterator.peekNext().getKey());
                String value = asString(iterator.peekNext().getValue());
                System.out.println("iterator " + key + ":" + value);
            }
        } finally {
            iterator.close();
        }
    }

    public static void workSnapshot(DB db) throws IOException {
        ReadOptions ro = new ReadOptions();
        ro.snapshot(db.getSnapshot());
        try {
            String green = asString(db.get(bytes("London"), ro));
            System.out.println("snapshot London value:" + green);
        } finally {
            ro.snapshot().close();
        }
    }

    public static void approximate(DB db) {
        long[] sizes = db.getApproximateSizes(new Range(bytes("a"), bytes("k")), new Range(bytes("k"), bytes("z")));
        System.out.println("approximate size:" + sizes[0] + "," + sizes[1]);
    }

    public static void batchMatchData(DB db) throws IOException {
        try (WriteBatch batch = db.createWriteBatch()) {
            for (int i = 0; i < 10; i++) {
                batch.put(bytes("key_" + i), bytes("value_" + i));
            }
            db.write(batch);
            System.out.println("batch match data success!");
        }
    }

    public static void dbStatus(DB db) {
        String status = db.getProperty("leveldb.stats");
        System.out.println("db status:" + status);
    }

    public static void pushPool(DB db) {
        //Using a memory pool to make native memory allocations more efficient:
        pushMemoryPool(1024 * 512);
        try {
            // .. work with the DB in here,
        } finally {
            popMemoryPool();
        }
    }

}
