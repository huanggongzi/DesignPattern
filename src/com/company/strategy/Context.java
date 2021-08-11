package com.company.strategy;

public class Context<T> {
    private Comparator<T> comparator;
    public Context(Comparator<T> comparator){
        this.comparator = comparator;
    }
    public int executeStrategy(T o1, T o2){
        return comparator.compare(o1, o2);
    }
}
