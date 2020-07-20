package com.lml.part.demo.test;

/**
 * @author shuishan
 * @date 2020/7/19
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(num());
        System.out.println(test());
    }

    public void show(){
        System.out.println("show ...");
    }

    public static StringBuilder test(){
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("1 ");
            return sb;
        }catch (Exception e){
            sb.append("2 ");
            return sb;
        }finally {
            sb.append("3  ");
        }
    }

    public static int num() {
        int x;
        try {
            x = 1;
            return x;
        } catch (Exception e) {
            x = 2;
            return x;
        } finally {
            x = 3;
        }
    }
}
