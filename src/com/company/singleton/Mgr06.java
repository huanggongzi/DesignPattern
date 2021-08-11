package com.company.singleton;

public class Mgr06 {
    private volatile static Mgr06 INSTANCE;

    private Mgr06() {
    }
    public static Mgr06 getInstance() {
        // 妄想通过减少同步代码块的方式去提高效率，然后不可行
        if (INSTANCE == null) {
            synchronized (Mgr06.class) {
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                    e.getStackTrace();
                }
                if (INSTANCE == null) {
                    INSTANCE = new Mgr06();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Mgr06.getInstance().hashCode());
                }
            }).start();
        }
    }
}
