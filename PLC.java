package com.BLC.ELC;

public class PLC {

	public static void main(String[] args) {
		Product product = new Product();
		product.setProductDetails("Laptop",501,75000.0);
		product.getProductDetails();
	}
}