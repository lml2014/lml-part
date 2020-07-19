package com.lml.part.demo.collections;

import com.alibaba.fastjson.JSON;
import org.checkerframework.checker.units.qual.C;

import java.security.spec.ECField;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author shuishan
 * @date 2020/3/16
 */
public class ConcurrentHashMapDemo {

    public static void main(String[] args) {
        ConcurrentHashMap<EntryHold, String> map = new ConcurrentHashMap<>();
        map.put(new EntryHold("aa"), "A");
        map.put(new EntryHold("bb"), "B");
        System.out.println(map.size());
        String value = map.get(new EntryHold("aa"));
        System.out.println(value);
        System.out.println(JSON.toJSONString(map));
    }

    private static class EntryHold {

        private String name;

        public EntryHold(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            EntryHold entryHold = (EntryHold) o;
            return Objects.equals(name, entryHold.name);
        }

        @Override
        public int hashCode() {
            return name.length();
        }
    }
}
