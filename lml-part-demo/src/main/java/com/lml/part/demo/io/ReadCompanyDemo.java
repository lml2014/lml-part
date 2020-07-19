package com.lml.part.demo.io;

import com.alibaba.fastjson.JSON;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.net.URI;
import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author shuishan
 * @date 2020/7/16
 */
public class ReadCompanyDemo {

    public static void main(String[] args) throws Exception {
        URL url = ReadCompanyDemo.class.getResource("/repeat.txt");
        if (url == null) {
            throw new NullPointerException();
        }
        System.out.println(url.getPath());
        File file = new File(url.getPath());
        FileInputStream fileInputStream = new FileInputStream(file);
        List<String> list = IOUtils.readLines(fileInputStream, "UTF-8");
        System.out.println(list.size());
        System.out.println(JSON.toJSONString(list));
        Set<Long> data = list.stream().map(Long::valueOf).collect(Collectors.toSet());
        System.out.println("data size:" + data.size());
        System.out.println(data);
    }
}
