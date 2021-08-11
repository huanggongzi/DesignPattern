package com.company.mediator;

public class Iraq extends Country {

    public Iraq(UnitedNations unitedNations) {
        super(unitedNations);
    }

    public void declare(String message, Country country) {
        unitedNations.declare(message, this, country);
    }

    public void getMessage(String message, Country country) {
        System.out.println("伊拉克获得" + country.toString() + "发来的信息：" + message);
    }

    @Override
    public String toString() {
        return "伊拉克";
    }
}
