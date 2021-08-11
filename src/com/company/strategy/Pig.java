package com.company.strategy;

import java.lang.annotation.Target;

public class Pig {
    int eat;

    public Pig(int eat) {
        this.eat = eat;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "eat=" + eat +
                '}';
    }
}
