package com.codecool.servlet;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    public static List<Item> cart = new ArrayList<>();

    public static double summa =  0;

    public static void addItem(Item item) {
        cart.add(item);
        summa += item.price;
    }

    public static void removeItem(Item item){
        cart.remove(item);
    }
}
