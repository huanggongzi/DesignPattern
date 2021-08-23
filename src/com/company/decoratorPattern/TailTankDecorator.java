package com.company.decoratorPattern;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 你的名字
 * @Date: 2021/08/24/0:17
 * @Description:
 */
public class TailTankDecorator extends TankDecorator {
    public TailTankDecorator(Tank tank) {
        super(tank);
    }

    public void tail() {
        System.out.println("我拥有尾巴的功能");
    }

    @Override
    public void operation() {
        tail();
        super.operation();
    }
}
