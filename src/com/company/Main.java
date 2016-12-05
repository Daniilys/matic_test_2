package com.company;

import com.company.products.FruitTea;
import com.company.products.Strawberries;
import com.company.discounts.BunchDiscount;
import com.company.discounts.SecondFreeDiscount;

public class Main {

    public static void main(String[] args) {
        Checkout checkout = new Checkout(
                new BunchDiscount(Strawberries.CODE, new BunchDiscount.BunchOptions(4.50f, 3),
                        new SecondFreeDiscount(FruitTea.CODE, null)));
        checkout.scan("SR");
        checkout.scan("SR");
        checkout.scan("SR");
        checkout.scan("FR");
        float totalCoast = checkout.calculateTotalCost();
        System.out.print(totalCoast);
    }
}
