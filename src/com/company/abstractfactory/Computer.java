package com.company.abstractfactory;

public class Computer extends Weapon {
    @Override
    void shoot() {
        System.out.println("我是电脑~");
    }
}
