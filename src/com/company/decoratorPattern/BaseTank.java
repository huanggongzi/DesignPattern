package com.company.decoratorPattern;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 你的名字
 * @Date: 2021/08/24/0:13
 * @Description:
 */
public class BaseTank extends Tank {
    @Override
    public void operation() {
        System.out.println("我拥有移动的功能");
    }
}
