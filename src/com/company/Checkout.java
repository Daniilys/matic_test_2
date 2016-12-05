package com.company;

import com.company.products.Product;
import com.company.products.ProductsFabric;
import com.company.discounts.Discount;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mahasamatman on 29/11/16.
 */
public class Checkout {
	private final Discount discount;
	private final List<Product> products = new ArrayList<>();
	private final ProductsFabric productsFabric = new ProductsFabric();

	public Checkout(final Discount discount) {
		this.discount = discount;
	}

	public void scan(final String productCode) {
		products.add(productsFabric.create(productCode));
	}

	public float calculateTotalCost() {
		float coast = products.stream()
				.map(Product::getPrice)
				.reduce((productPrice, totalPrice) ->
						totalPrice += productPrice)
				.get();

		float totalDiscount = this.discount.apply(products);
		float totalCoast = coast - totalDiscount;
		return totalCoast;
	}
}

