package com.company.singleton;

/**
 * lazy loading
 * 懒汉式
 * 达到了按需初始化的目的，但是线程是不安全的
 */
public class Mgr03 {
    private static Mgr03 INSTANCE;

    private Mgr03() {

    }

    public static Mgr03 getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr03();
        }
        return INSTANCE;
    }

    // lamada表达式对一个
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Mgr03.getInstance().hashCode());
                }
            }).start();
        }
    }
}
