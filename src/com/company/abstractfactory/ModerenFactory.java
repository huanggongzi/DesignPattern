package com.company.abstractfactory;
public class ModerenFactory extends AbstractFactory {
    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Vehicle createVehicle() {
        return new BMW();
    }

    @Override
    Weapon createWeapon() {
        return new AK47();
    }
}
