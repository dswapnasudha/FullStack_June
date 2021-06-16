package com.training.qn36;

public class ProductMain {

	public static void main(String[] args) {
		
		
		Product product = new Product();
		product.setId(1);
		product.setProductName("Printer");
		product.setSupplierName("HP");
		
		System.out.println("Product Id is :" + product.getId());
		System.out.println("Product Name is :" + product.getProductName());
		System.out.println("Supplier Name is :"+ product.getSupplierName());
		
	}

}
