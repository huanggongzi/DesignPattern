package com.company.abstractfactory;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // 正常人走一段时间
        AbstractFactory abstractFactory = new ModerenFactory();
        // 进行赋值
        Vehicle c = abstractFactory.createVehicle();
        Weapon weapon = abstractFactory.createWeapon();
        Food food = abstractFactory.createFood();
        // 走到警局，需要换装
        abstractFactory = new CleverFactory();
        // 进行赋值
        c = abstractFactory.createVehicle();
        weapon = abstractFactory.createWeapon();
        food = abstractFactory.createFood();
    }
}
