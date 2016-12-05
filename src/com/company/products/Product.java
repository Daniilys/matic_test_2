package com.company.products;

/**
 * Created by mahasamatman on 29/11/16.
 */
public abstract class Product {

	private final String code;
	private final float price;

	protected Product(String code, float price) {
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
