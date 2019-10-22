package com.HomeWorkBank;

import java.lang.Thread.State;

public class MyMain {
    public static void main(String[] args) {
        bankAccaunt b1 = new bankAccaunt("avraham",5000.0);
        bankAccaunt b2 = new bankAccaunt("avraham",5000.0);
        bankAccaunt b3 = new bankAccaunt("avraham",5000.0);

        b1.power();
//        b2.start();
//        b3.start();
    }



}
