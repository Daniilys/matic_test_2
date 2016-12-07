package com.company.products;

/**
 * Created by mahasamatman on 29/11/16.
 */
public class Product {

	private final String code;
	private final float price;

	protected Product(final String code, final float price) {
		if (code == null) {
			throw new NullPointerException("Product code can't be null");
		} else if (code.isEmpty()) {
			throw new IllegalArgumentException("Product code can't be empty");
		}

		if (price < 0) {
			throw new IllegalArgumentException("Product price can't be negative");
		}

		this.code = code;
		this.price = price;
	}

	public float getPrice() {
		return price;
	}

	public String getCode() {
		return code;
	}
}
