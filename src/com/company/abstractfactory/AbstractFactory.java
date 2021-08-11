package com.company.abstractfactory;

/**
 * 抽象工厂
 */
public abstract class AbstractFactory {
    abstract Food createFood();
    // 车辆
    abstract Vehicle createVehicle();
    // 武器
    abstract Weapon createWeapon();
}
