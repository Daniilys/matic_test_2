package com.company.discounts;

import com.company.products.Product;

import java.util.List;

/**
 * Created by mahasamatman on 29/11/16.
 */
public abstract class Discount {

	private final Discount discount;

	public Discount(final Discount discount) {
		this.discount = discount;
	}

	public float apply(final List<Product> products) {
		float discount = 0.0f;
		if (this.discount != null) {
			discount = this.discount.apply(products);
		}

		return discount + applyInternal(products);
	}

	protected abstract float applyInternal(List<Product> products);
}
