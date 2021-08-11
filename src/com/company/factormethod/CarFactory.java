package com.company.factormethod;

public class CarFactory {
    public Moveable creatCar(){
        return new Car();
    }
}
