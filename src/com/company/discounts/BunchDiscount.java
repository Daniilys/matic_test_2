package com.company.discounts;

import com.company.products.Product;

import java.util.List;

/**
 * Created by mahasamatman on 29/11/16.
 */
public class BunchDiscount extends Discount {

	private final String trackedProductCode;
	private final BunchOptions bunchOptions;

	public BunchDiscount(final String productCode,
	                     final BunchOptions bunchOptions,
	                     final Discount discount) {
		super(discount);
		trackedProductCode = productCode;
		this.bunchOptions = bunchOptions;
	}

	@Override
	protected float applyInternal(final List<Product> products) {
		int count = 0;
		float price = 0;

		for (Product product : products) {
			if (product.getCode().equals(trackedProductCode)) {
				count++;
				price += product.getPrice();
			}
		}

		float discount = 0;
		if (count >= bunchOptions.getMinBunchSize()) {
			discount = price - count * bunchOptions.getBunchPrice();
		}
		return discount;

	}

	public static class BunchOptions {

		private final float bunchPrice;
		private final int minBunchSize;

		public BunchOptions(float bunchPrice, int minBunchSize) {
			this.bunchPrice = bunchPrice;
			this.minBunchSize = minBunchSize;
		}


		public float getBunchPrice() {
			return bunchPrice;
		}

		public int getMinBunchSize() {
			return minBunchSize;
		}
	}
}
