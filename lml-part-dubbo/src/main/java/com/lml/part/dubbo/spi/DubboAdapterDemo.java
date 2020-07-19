package com.lml.part.dubbo.spi;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.ProxyFactory;

/**
 * ProxyFactory proxyFactory = ExtensionLoader.getExtensionLoader(ProxyFactory.class).getAdaptiveExtension();
 * 建议大家写点测试用例，对 Protocol、LoadBalance 以及 Transporter 等接口的自适应拓展类代码生成过程进行调试。
 *
 * @author shuishan
 * @date 2020/3/15
 */
public class DubboAdapterDemo {

    public static void main(String[] args) {
        ExtensionLoader<ProxyFactory> proxyFactoryExtensionLoader = ExtensionLoader.getExtensionLoader(ProxyFactory.class);
        ProxyFactory proxyFactory = proxyFactoryExtensionLoader.getAdaptiveExtension();
        System.out.println(proxyFactory.getClass().getName());
    }
}
