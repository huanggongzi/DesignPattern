package com.company.singleton;

/**
 *
 */
public class Mgr05 {
    private static Mgr05 INSTANCE;
    private Mgr05(){};
    public static Mgr05 getInstance(){
        // 妄想通过减少同步代码块的方式去提高效率，然后不可行
        if(INSTANCE == null){
            synchronized (Mgr05.class){
                try {
                    Thread.sleep(1);
                }catch (Exception e){
                    e.getStackTrace();
                }
                INSTANCE = new Mgr05();
            }
        }
        return INSTANCE;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Mgr05.getInstance().hashCode());
                }
            }).start();
        }
    }
}
