package com.company.singleton;

/**
 * 饿汉式
 * 当该类加载到内存之后，就会实例化一个单例，JVM保证其线程安全
 * 简单实用，推荐使用！
 * 唯一缺点：不管能不能用到，类装载时就会完成实例化（）
 */
public class Mgr01 {

    private static final Mgr01 INSTANCE = new Mgr01();

    private Mgr01() {
    }

    public static Mgr01 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Mgr01 mgr01 = Mgr01.getInstance();
        Mgr01 mgr02 = Mgr01.getInstance();
        System.out.println(mgr01 == mgr02);
    }
}
