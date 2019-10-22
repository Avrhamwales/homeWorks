package com.HomeWorks2;

import javax.swing.*;

public class healthyHamburger extends Hambuger {
    public healthyHamburger( String typeofmeat, int price) {
        super("healthy",typeofmeat,"Full heat",price);

    }



    public void toadditions(){
        super.toadditions();
        if(input("cola Max")){
            additions.put("colaMax",10);
        }
        if(input("aqua water")){
            additions.put("aqua water",7);
        }
    }
}
