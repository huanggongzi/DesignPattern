package com.company.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 你的名字
 * @Date: 2021/09/11/16:54
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        child.wakeUp();
    }
}

class Child {
    private Boolean cry = false;
    private List<Observer> observers = new ArrayList<>();

    {
        observers.add(new Dad());
        observers.add(new Mum());
        observers.add(new Dog());
    }

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        cry = true;
        WakeUpEvent event = new WakeUpEvent(System.currentTimeMillis(), "bed", this);
        for (Observer observer : observers) {
            observer.actionOnWakeUp(event);
        }
    }
}


class WakeUpEvent {
    long timestamp;
    String loc;
    // 事件源对象本身
    Child source;

    public WakeUpEvent(long timestamp, String loc, Child source) {
        this.timestamp = timestamp;
        this.loc = loc;
        this.source = source;
    }
}

interface Observer {
    void actionOnWakeUp(WakeUpEvent event);
}

class Dog implements Observer {
    public void wang() {
        System.out.println("Dog wangwangwang");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent event) {
        wang();
    }
}

class Dad implements Observer {
    public void feed() {
        System.out.println("dad feed");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent event) {
        feed();
    }
}

class Mum implements Observer {
    public void bao() {
        System.out.println("Mum bao");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent event) {
        bao();
    }
}