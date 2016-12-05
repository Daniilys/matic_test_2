package com.company.products;

/**
 * Created by mahasamatman on 29/11/16.
 */
public class ProductsFabric {

	public Product create(final String productCode) {
		switch (productCode) {
			case AppleJuice.CODE :
				return new AppleJuice();
			case Coffee.CODE :
				return new Coffee();
			case FruitTea.CODE :
				return new FruitTea();
			case Strawberries.CODE :
				return new Strawberries();
			default:
				throw new IllegalArgumentException("No product found with that code");
		}
	}
}
