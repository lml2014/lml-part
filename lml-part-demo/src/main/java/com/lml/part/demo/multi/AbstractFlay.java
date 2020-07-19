package com.lml.part.demo.multi;

/**
 * @author shuishan
 * @date 2020/4/26
 */
public abstract class AbstractFlay implements IFlay {

    @Override
    public void flay() {
        System.out.println("we are flaying ....");
        flaying();
    }

    abstract void flaying();
}
