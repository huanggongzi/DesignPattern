package com.company.singleton;

import org.junit.Test;

import java.awt.image.VolatileImage;

public class Main {
    /**
     * 饿汉式的验证
     */
    @Test
    public void hungryChineseStyle(){
        Mgr01 mgr01 = Mgr01.getInstance();
        Mgr01 mgr02 = Mgr01.getInstance();
        System.out.println(mgr01 == mgr02);
    }

    /**
     * 饿汉式2的验证
     */
    @Test
    public void hungryChineseStyleTwo(){
        Mgr02 mgr01 = Mgr02.getInstance();
        Mgr02 mgr02 = Mgr02.getInstance();
        System.out.println(mgr01 == mgr02);
    }

    /**
     * 懒汉式的验证
     */
    @Test
    public void lazyStyle(){
        Mgr03 mgr01 = Mgr03.getInstance();
        Mgr03 mgr02 = Mgr03.getInstance();
        System.out.println(mgr01 == mgr02);
    }

    public static void main(String[] args) {
    }
}
