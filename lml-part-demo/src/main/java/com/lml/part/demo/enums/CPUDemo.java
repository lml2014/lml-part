package com.lml.part.demo.enums;

/**
 * @author shuishan
 * @date 2020/4/9
 */
public class CPUDemo {

    public static void main(String[] args) throws InterruptedException {
        while (true){
            for (int i = 0; i < 9600000; i++) {
                ;
            }
            System.out.println("sleep..." + System.currentTimeMillis());
            Thread.sleep(10);
        }
    }
}
