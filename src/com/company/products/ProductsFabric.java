package com.company.products;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mahasamatman on 29/11/16.
 */
public class ProductsFabric {
	public static final String APPLE_JUICE_CODE = "AJ";
	public static final String COFFEE_CODE = "CF";
	public static final String FRUIT_TEA_CODE = "FR";
	public static final String STRAWBERRIES_CODE = "SR";

	private Map<String, Float> productPriceMap = new HashMap<>();

	public ProductsFabric() {
		productPriceMap.put(APPLE_JUICE_CODE, 7.25f);
		productPriceMap.put(COFFEE_CODE, 11.23f);
		productPriceMap.put(FRUIT_TEA_CODE, 3.11f);
		productPriceMap.put(STRAWBERRIES_CODE, 5.0f);
	}

	public Product create(final String productCode) {
		if (productPriceMap.containsKey(productCode)) {
			float productPrice = productPriceMap.get(productCode);
			return new Product(productCode, productPrice);
		} else {
			throw new IllegalArgumentException("No product found with that code");
		}
	}
}
