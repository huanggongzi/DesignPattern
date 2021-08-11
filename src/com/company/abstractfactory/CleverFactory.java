package com.company.abstractfactory;

public class CleverFactory  extends AbstractFactory{
    @Override
    Food createFood() {
        return new StickCandy();
    }

    @Override
    Vehicle createVehicle() {
        return new SkateBoard();
    }

    @Override
    Weapon createWeapon() {
        return new Computer();
    }
}
