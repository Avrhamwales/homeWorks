package com.HomeWorks2;

import javax.swing.*;

public class deloxHamburger extends Hambuger {
    public deloxHamburger(String typeofamduger, String typeofbread, String typeofmeat, int price) {
        super(typeofamduger, typeofbread, typeofmeat, price);
        additions.put("chips",5);
        additions.put("drink",10);
    }
    public void toadditions(){
        JOptionPane.showMessageDialog(null,"Sorry!\nThere is no extension selection for the selected product");
    }
}
