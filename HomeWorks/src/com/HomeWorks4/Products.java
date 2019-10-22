package com.HomeWorks4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.regex.MatchResult;

public class Products implements Comparable<Products> {
    private static List<Products> listProduct = new ArrayList<>();
//    private static List<String> nameProduct = new ArrayList<>();
    private String produkName;
    private double price;
    private int quantity;
    private boolean replenishment = true;

    public String toString() {
        return "produkt \t" + produkName +
                "\nprice \t\t" + price +
                "\nquantity \t" + quantity+"\n-------------\n";
    }


    @Override
    public int compareTo(Products o) {
        return this.produkName.compareTo(o.produkName);
    }
    private Products(){};

    public String getProdukName(){
        return this.produkName;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Products products = (Products) o;
//        return Double.compare(products.price, price) == 0 &&
//                quantity == products.quantity &&
//                replenishment == products.replenishment &&
//                Objects.equals(produkName, products.produkName);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(produkName, price, quantity, replenishment);
    }


    public Products(String produkName, double price, int quantity, boolean replenishment) {
            Products x = new Products();
            x.produkName = produkName;
            x.price = price;
            x.quantity = quantity;
            x.replenishment = replenishment;

        for (Products i:Products.listProduct) {
            if (i.produkName.equals(produkName)){
                Products.listProduct.remove(i);
                Products.listProduct.add(x);
            }
            else {
                Products.listProduct.add(x);
        }

    }
    }


    public static void getproductList() {
        Collections.sort(listProduct);
        System.out.println("  list produkts\n______________");
        System.out.println(listProduct);
    }
}

