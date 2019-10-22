package com.HomeWorks3;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class mymain {
    public static void main(String[] args) {
        ArrayList<Grup> grups = new ArrayList<>();
        Plyers f1 = new Football("avi");
        Plyers f2 = new Football("amit");
        Plyers b1 = new BaitBool("dani");
        Plyers b2 = new BaitBool("elhad");
        Plyers fa1 = new FootballUSA("lihor");
        Plyers fa2 = new FootballUSA("osher");

        Grup g1 = new Grup("Macaby Tel-Aviv");
        Grup g2 = new Grup("Beytar Jerusalem");
        Grup g3 = new Grup("macaby bat-yam");
        Grup g4 = new Grup("macaby chayfa");

        g1.addplayer(f1);
        g1.addplayer(f1);
        g1.addplayer(f2);
        g2.addplayer(b1);
        g2.addplayer(b2);
        g3.addplayer(fa1);
        g3.addplayer(fa2);
        g4.addplayer(fa1);
        g4.addplayer(fa2);


        System.out.println(g1.getSumplayers());
        System.out.println(g2.getSumplayers());
        System.out.println(g3.getSumplayers());

        g4.updateResults(g3,3,4);
        g4.updateResults(g3,2,2);
        g1.updateResults(g2,8,6);
        g1.updateResults(g3,7,4);
        g2.updateResults(g3,10,10);

        //g3.scoringGroup();
        //g4.scoringGroup();

        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
        System.out.println(g4);

        grups.add(g1);
        grups.add(g2);
        grups.add(g3);
        grups.add(g4);
        Collections.sort(grups);
        for (Grup i: grups) {
            System.out.print(i.getNameGrup()+" | ");
        }


    }

}
