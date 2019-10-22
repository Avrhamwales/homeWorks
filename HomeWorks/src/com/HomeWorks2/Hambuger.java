package com.HomeWorks2;

import javax.swing.*;
import java.util.HashMap;

public class Hambuger {
    protected String typeofamduger,typeofbread,typeofmeat;
    protected int price;
    protected HashMap<String,Integer> additions = new HashMap<String,Integer>();

    public  Hambuger(String typeofamduger,String typeofbread,String typeofmeat, int price){
        this.typeofamduger=typeofamduger;
        this.typeofbread=typeofbread;
        this.typeofmeat=typeofmeat;
        this.price=price;
        toadditions();
    }


    void toadditions(){
        if(input("ketshop")){
            additions.put("ketshop",3);
        }
        if(input("olives")){
            additions.put("olives",2);
        }
        if(input("mushrooms")){
            additions.put("mushrooms",4);
        }
        if(input("Tomatoes")){
            additions.put("Tomatoes",5);
        }
    }

    protected boolean input(String message){
        int i = JOptionPane.showConfirmDialog(null,"You want to add "+message+" ?","Select Extra",JOptionPane.YES_NO_OPTION);
        return i == JOptionPane.YES_OPTION?true:false;
    }

    public void alladditions(){
        System.out.println("additions \tprice\n" +
                "---------\t-----\n"+
                "ketshop \t3\n" +
                "olives \t2\n" +
                "mushrooms \t4\n" +
                "Tomatoes \t4");
    }
    protected String sumprice(){
        int sum=0;
        for(int i : additions.values()){
            sum+=i;
        }
        sum+=price;
        return String.valueOf(sum);
    }
    public String toString(){
        return "type of amduger\t"+typeofamduger+
                "\ntype of bread\t"+typeofbread+
                "\ntype of meat\t"+typeofmeat+
                "\nprice\t"+price+
                "\nadditions\t"+additions+
                "\nsum price\t"+sumprice();
    }





}
