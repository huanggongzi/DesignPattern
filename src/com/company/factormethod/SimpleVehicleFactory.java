package com.company.factormethod;

import java.util.logging.Logger;

/**
 * 简单工厂的可扩展性不好
 */
public class SimpleVehicleFactory {
    public Moveable getMoveable(String moveableType) {
        if (moveableType == null) {
            return null;
        }
        if (moveableType.equalsIgnoreCase("Car")) {
            // 权限控制：获取当前登录信息，进行判断
            // 日志打印：logger.debug
            return new Car();
        }
        if (moveableType.equalsIgnoreCase("Plane")) {
            // 权限控制
            return new Plane();
        }
        if (moveableType.equalsIgnoreCase("Broom")) {
            // 权限控制
            return new Broom();
        }
        return null;
    }
}
