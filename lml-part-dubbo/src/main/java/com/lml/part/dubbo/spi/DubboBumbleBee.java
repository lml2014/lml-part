package com.lml.part.dubbo.spi;

import org.apache.dubbo.common.extension.ExtensionFactory;

/**
 * @author shuishan
 * @date 2020/3/15
 */
public class DubboBumbleBee implements DubboRobot {

    private ExtensionFactory extensionFactory;

    @Override
    public void sayHello() {
        System.out.println("dubbo spi amazing.");
    }

    public ExtensionFactory getExtensionFactory() {
        return extensionFactory;
    }

    public void setExtensionFactory(ExtensionFactory extensionFactory) {
        this.extensionFactory = extensionFactory;
    }
}
