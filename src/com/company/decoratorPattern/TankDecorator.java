package com.company.decoratorPattern;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 你的名字
 * @Date: 2021/08/24/0:14
 * @Description:
 */
public class TankDecorator extends Tank {
    private Tank tank;

    @Override
    public void operation() {
        if (tank != null) {
            tank.operation();
        }
    }

    public TankDecorator(Tank tank) {
        this.tank = tank;
    }
}
