package com.lml.part.dubbo.spi;

import org.apache.dubbo.common.extension.ExtensionFactory;
import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @author shuishan
 * @date 2020/3/15
 */
public class DubboSpiDemo {

    public static void main(String[] args) {
        ExtensionLoader<ExtensionFactory> factoryExtensionLoader = ExtensionLoader.getExtensionLoader(ExtensionFactory.class);
        ExtensionFactory factory = factoryExtensionLoader.getAdaptiveExtension();
        System.out.println("default factory:" + factory);
        factoryExtensionLoader.getDefaultExtension();
        factoryExtensionLoader.getSupportedExtensions();
        ExtensionLoader<DubboRobot> extensionLoader = ExtensionLoader.getExtensionLoader(DubboRobot.class);
        DubboRobot dubboRobot = extensionLoader.getExtension("dubboBumbleBee");
        dubboRobot.sayHello();

    }
}
