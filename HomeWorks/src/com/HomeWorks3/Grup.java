package com.HomeWorks3;

import javax.swing.*;
import java.util.ArrayList;

public class Grup <T extends Plyers> implements Comparable<Grup>{
    private String nameGrup;
    ArrayList<String> players = new ArrayList<>();
    private int sumplayers,Victories, points, losses, draw;


    public Grup(String nameGrup) {
        this.nameGrup = nameGrup;
    }

    public String getNameGrup() {
        return nameGrup;
    }

    public void setNameGrup(String nameGrup) {
        this.nameGrup = nameGrup;
    }

    public int getSumplayers() {
        this.sumplayers= players.size();
        return sumplayers;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public void addplayer(T plyers){
        //String nameplayer = JOptionPane.showInputDialog("tipe the player name to add in the group");
        if (this.players.contains(plyers.getName())){
            JOptionPane.showMessageDialog(null,"You cannot add a name that appears in the group");
        }
        else{
            this.players.add(plyers.getName());
        }

    }

    public void updateResults(Grup anotherGroup, int thisGouls, int anotherGouls){
        //this.victoeies+=(thisGouls-anotherGouls);
        //anotherGroup.victoeies+=anotherGouls-thisGouls;
        this.Victories=thisGouls;
        anotherGroup.Victories=anotherGouls;
        this.losses=anotherGouls;
        anotherGroup.losses=thisGouls;
        if (thisGouls>anotherGouls){
            this.points +=(thisGouls-anotherGouls);
        }
        else {
            anotherGroup.points +=(anotherGouls-thisGouls);
        }
        if (thisGouls==anotherGouls){
            this.draw+=1;
            anotherGroup.draw+=1;
        }

        JOptionPane.showMessageDialog(null,"The update was successful");
    }
    public void scoringGroup(){
        JOptionPane.showMessageDialog(null,"group "+nameGrup+"\nPoints prom the group: "+(this.points *2+this.draw));
    }
    public String toString(){
        return "group name \t"+nameGrup+
                "\nplayers \t"+players+
                "\nVictories\t"+Victories+
                "\nlosses \t\t"+losses+
                "\ndraw \t\t"+draw+
                "\npoints \t\t" + points +
                "\n-----------------------";

    }

    @Override
    public int compareTo(Grup o) {
        return (o.points +o.draw)-(this.points +this.draw);
    }
}
