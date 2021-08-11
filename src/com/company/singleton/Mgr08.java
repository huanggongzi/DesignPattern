package com.company.singleton;

/**
 * 枚举类没有构造方法，还可以防止序列化和反序列化
 */
public enum Mgr08 {
    INSTANCE;
    public Mgr08 getInstance(){
        return INSTANCE;
    }
}
