package com.stan.singleton;

/**
 * 双重校验锁
 */
public class DclSingleton {
    private static DclSingleton INSTANCE;

    private DclSingleton(){}

    public static DclSingleton getInstance(){
        if(null == INSTANCE){
            synchronized (DclSingleton.class){
                INSTANCE = new DclSingleton();
            }
        }

        return INSTANCE;
    }

    public void foo(){
        System.out.println("双重校验锁 foo");
    }
}
