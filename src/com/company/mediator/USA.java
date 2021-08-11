package com.company.mediator;

public class USA extends Country {
    public USA(UnitedNations unitedNations) {
        super(unitedNations);
    }

    public void declare(String message, Country country) {
        unitedNations.declare(message, this, country);
    }

    public void getMessage(String message, Country country) {
        System.out.println("美国获得" + country + "发来的信息：" + message);
    }

    @Override
    public String toString() {
        return "美国";
    }
}
