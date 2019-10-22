package com.company;

import java.util.Scanner;

public class Praimbiggest {

    public static void praimbiggest() {

        Scanner scanner = new Scanner(System.in);
        while (0==0) {
            System.out.print("enter a number: ");
            int num = scanner.nextInt();
            if (num==-1)break;
            int i = 2;
            while (num % i != 0) {
                i++;
            }
            System.out.println(num +"/"+i+"="+num / i);
        }
    }

}
