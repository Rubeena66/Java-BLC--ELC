package com.BLC.ELC;

public class Product {
	private String productName;
	private int productId;
	private double price;

	public void setProductDetails(String name, int id, double prc) {
		productName = name;
		productId = id;
		price = prc;
	}

	public void getProductDetails() {
		System.out.println("Product Name :" + productName);
		System.out.println("Product ID   :" + productId);
		System.out.println("Product Price:" + price);
	}
}