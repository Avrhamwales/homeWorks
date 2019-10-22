package com.HomeWorkBank;

import java.util.Scanner;

public class bankAccaunt {
    private String username;
    private Double sum=5000.5;
    Scanner scanner = new Scanner(System.in);

    public bankAccaunt(String username, Double sum) {
        this.username=username;
        this.sum= sum;
    }

    public void deposit() {
        new Thread(){
        public void run(){
            System.out.println("הקש סכום להפקדה");
            double x = scanner.nextDouble();
            if (x > 0) {
                sum+=x;
                System.out.println("deposits " + sum + ":");
            } else {
                System.out.println("you can't deposit less than 0");
            }
            System.out.println("היתרה הוא: "+sum+" "+currentThread().getName());
        }
        }.start();

    }

    public void withdrowle () {
        new Thread(){
            public void run(){
                System.out.println("הקש סכום למשיכה");
                double x = scanner.nextDouble();
                if (x > 0&&sum>0&&x<sum) {
                    sum-=x;
                    System.out.println("withdrowle " + x + ":");
                } else {
                    System.out.println("you can't withdrowle less than 0 or from minus");
                }
                System.out.println("היתרה היא: "+sum+" "+currentThread().getName());
            }
        }.start();

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }


    public void power(){
        int x;
        System.out.println("למשיכה הקש 1, להפקדה הקש 2");
        do {
             x =scanner.nextInt();
             if (x==1)
                 this.deposit();
             if (x==2)
                this.withdrowle();
             if (x!=1&&x!=2)
                 System.out.println("הקש מספר תקין");
        }while(x!=1&&x!=2);
    }
}
