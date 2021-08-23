package com.company.decoratorPattern;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 你的名字
 * @Date: 2021/08/24/0:26
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        // 最初的坦克
        Tank tank = new BaseTank();

        // 给我们的坦克增加一个血条
        tank = new BloodTankDecorator(tank);

        // 给我们的坦克增加一个尾巴
        tank = new TailTankDecorator(tank);

        // 给我们的坦克增加一个攻击
        tank = new AttackTankDecorator(tank);

        // 输出坦克当前含有的功能
        tank.operation();


    }
}
