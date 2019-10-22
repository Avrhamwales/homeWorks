package com.company;

public class MethodTime {

    public static String time (int minut, int second){
        int hours;
        int minuts;
        int seconds;
        hours=Math.abs(minut)/60;
        minuts=Math.abs(minut)%60;
        seconds=Math.min(60,second);
        return (hours+":"+minuts+":"+seconds);
    }

    public static String time (int second){
        int minuts;
        int seconds;
        minuts=second/60;
        seconds=second%60;
        return (String)(minuts+":"+seconds);
    }

}
