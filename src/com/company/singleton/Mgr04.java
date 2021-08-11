package com.company.singleton;

/**
 * lazy loading
 * 懒汉式 加锁
 * 直接在我们的静态方法去加锁，锁的是当前 Mgr04.class
 */
public class Mgr04 {
    private static Mgr04 INSTANCE;

    private Mgr04() {

    }

    public static synchronized Mgr04 getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr04();
        }
        return INSTANCE;
    }

    // lamada表达式对一个
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Mgr04.getInstance().hashCode());
                }
            }).start();
        }
    }
}
