package com.company.mediator;

public abstract class UnitedNations {
    // 传递的消息 发送的国家 接受的国家
    public abstract void declare(String message, Country sendcountry, Country acceptCountry);
}
