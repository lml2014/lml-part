package com.lml.part.demo.collections;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author shuishan
 * @date 2020/3/23
 */
public class UnSafeDemo {

    public static void main(String[] args) throws Exception {
        Unsafe unsafe = reflectUnSafe();
        System.out.println(unsafe.getClass().getClassLoader());


    }

    private static Unsafe reflectUnSafe() throws NoSuchFieldException, IllegalAccessException {
        Field field = Unsafe.class.getDeclaredField("theUnsafe");
        field.setAccessible(true);
        return (Unsafe) field.get(null);
    }

    public static Unsafe reflect() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = Unsafe.class.getMethod("getUnsafe", null);
        method.setAccessible(true);
        return (Unsafe) method.invoke(null);
    }
}
