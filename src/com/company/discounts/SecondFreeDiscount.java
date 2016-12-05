package com.company.discounts;

import com.company.products.Product;

import java.util.List;

/**
 * Created by mahasamatman on 29/11/16.
 */
public class SecondFreeDiscount extends Discount {

	private final String trackedProductCode;

	public SecondFreeDiscount(final String productCode, final Discount discount) {
		super(discount);
		trackedProductCode = productCode;
	}

	@Override
	protected float applyInternal(final List<Product> products) {
		float discount = 0;
		boolean free = false;

		for (Product product : products) {
			if (product.getCode().equals(trackedProductCode)) {
				if (free) {
					discount += product.getPrice();
				}

				free = !free;
			}
		}
		return discount;
	}
}
