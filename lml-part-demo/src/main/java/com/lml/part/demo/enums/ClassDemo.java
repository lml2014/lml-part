package com.lml.part.demo.enums;

import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;
import java.util.EventObject;

/**
 * @author shuishan
 * @date 2020/3/30
 */
public class ClassDemo extends EventObject {


    public ClassDemo(Object source) {
        super(source);
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        ClassDemo demo = new ClassDemo(arrayList);
        System.out.println(demo.getSource().getClass().getName());
        System.out.println(demo.getSource().getClass().getTypeName());
        System.out.println(demo.getSource().getClass().getSimpleName());
    }
}
