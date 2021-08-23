package com.company.decoratorPattern;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 你的名字
 * @Date: 2021/08/24/0:24
 * @Description:
 */
public class AttackTankDecorator extends TankDecorator {
    public AttackTankDecorator(Tank tank) {
        super(tank);
    }

    public void attack() {
        System.out.println("我拥有攻击的功能");
    }

    @Override
    public void operation() {
        attack();
        super.operation();
    }
}
