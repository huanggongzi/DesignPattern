package com.company.factormethod;

public class Main {
    public static void main(String[] args) {
        // Moveable moveable = new SimpleVehicleFactory().getMoveable("Car");
        Moveable moveable = new CarFactory().creatCar();
        moveable.go();
    }
}
