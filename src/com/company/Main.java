package com.company;

import com.company.products.ProductsFabric;
import com.company.discounts.BunchDiscount;
import com.company.discounts.SecondFreeDiscount;

public class Main {

    public static void main(String[] args) {
        Checkout checkout = new Checkout(
                new BunchDiscount(ProductsFabric.STRAWBERRIES_CODE, new BunchDiscount.BunchOptions(4.50f, 3),
                        new SecondFreeDiscount(ProductsFabric.FRUIT_TEA_CODE, null)));
        checkout.scan("SR");
        checkout.scan("SR");
        checkout.scan("SR");
        checkout.scan("FR");
        float totalCoast = checkout.calculateTotalCost();
        System.out.print(totalCoast);
    }
}
