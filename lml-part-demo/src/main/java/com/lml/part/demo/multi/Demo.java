package com.lml.part.demo.multi;

/**
 * @author shuishan
 * @date 2020/4/26
 */
public class Demo {

    public static void main(String[] args) {
        IFlay flay = new MoneyFlay();
        flay.flay();
        System.out.println(flay instanceof AbstractFlay);
        System.out.println(flay instanceof MoneyFlay);
    }
}
