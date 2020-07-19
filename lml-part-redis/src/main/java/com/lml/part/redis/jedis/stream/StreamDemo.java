package com.lml.part.redis.jedis.stream;

import com.alibaba.fastjson.JSON;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.StreamEntry;
import redis.clients.jedis.StreamEntryID;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shuishan
 * @date 2020/3/9
 */
public class StreamDemo {

    public static void main(String[] args) {
        Jedis jedis = new Jedis();
        String stream = "codehole";

        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("name", "laoqian");
        map1.put("age", "30");
        StreamEntryID streamEntryID1 = jedis.xadd(stream, StreamEntryID.NEW_ENTRY, map1);
        System.out.println(streamEntryID1);

        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("name", "laoqian");
        map2.put("age", "30");
        StreamEntryID streamEntryID2 = jedis.xadd(stream, StreamEntryID.NEW_ENTRY, map2);
        System.out.println(streamEntryID2);

        Long length = jedis.xlen(stream);
        System.out.println(length);

        List<StreamEntry> list = jedis.xrange(stream, new StreamEntryID("-"), new StreamEntryID("+"), 0);
        System.out.println(JSON.toJSONString(list));

        jedis.close();
    }

}
