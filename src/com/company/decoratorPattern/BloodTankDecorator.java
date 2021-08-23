package com.company.decoratorPattern;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 你的名字
 * @Date: 2021/08/24/0:16
 * @Description:
 */
public class BloodTankDecorator extends TankDecorator{
    public BloodTankDecorator(Tank tank) {
        super(tank);
    }

    public void blood() {
        System.out.println("我拥有血条的功能");
    }

    @Override
    public void operation() {
        blood();
        super.operation();
    }
}
