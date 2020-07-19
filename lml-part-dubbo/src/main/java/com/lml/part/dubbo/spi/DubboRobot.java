package com.lml.part.dubbo.spi;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author shuishan
 * @date 2020/3/15
 */
@SPI
public interface DubboRobot {

    void sayHello();
}
