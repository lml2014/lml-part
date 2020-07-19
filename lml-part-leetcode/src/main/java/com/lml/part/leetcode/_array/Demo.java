package com.lml.part.leetcode._array;

/**
 * @author shuishan
 * @date 2020/6/27
 */
public class Demo {

    public static void main(String[] args) {
        int b = 1534236469;
        System.out.println(b > Integer.MAX_VALUE);
        b = Integer.MAX_VALUE + 1;
        System.out.println(b);

    }

    public int compareVersion(String version1, String version2) {
        if( version1 == null || version2 == null){
            return 0;
        }
        String[] vv1 = version1.split("\\.");
        String[] vv2 = version2.split("\\.");
        int length = Math.max(vv1.length,vv2.length);
        for(int i=0; i< length; i++){
            int v1 = (i < vv1.length ?Integer.parseInt(vv1[i]):0);
            int v2 = (i < vv2.length ?Integer.parseInt(vv2[i]):0);
            if(v1 > v2){
                return 1;
            }else{
                return -1;
            }
        }
        return 0;
    }
}
