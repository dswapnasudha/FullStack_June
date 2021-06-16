package com.training.arrays;

public class Product {
	int id;
	String name;
	double cost;

	Product(int id, String name,double cost) {
		this.id = id;
		this.name = name;
		this.cost = cost;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {

		/*
		 * Product[] dummy = {new Product(10, "Pen",200), new Product(20, "Pencil",300),
		 * new Product(30, "Eraser",500)};
		 */
		// Create a products that can store 3 Product Objects
		Product[] products = new Product[3];

		// Creating 3 Product Objects
		Product product1 = new Product(10, "Pen",200);
		Product product2 = new Product(20, "Pencil",300);
		Product product3 = new Product(30, "Eraser",500);

		// Add Product Objects to products
		products[0] = product1;
		products[1] = product2;
		products[2] = product3;
		double cost=0;

		// Print the products
		for (Product temp : products) {
			System.out.println(temp);
			System.out.println(temp.getId() + "-" + temp.getName() + "-" + temp.getCost());
			cost += temp.getCost();
		}
System.out.println(cost);
		/*
		 * System.out.println("Dummy Array"); for (Product temp : dummy) {
		 * System.out.println(temp); System.out.println(temp.getId() + "-" +
		 * temp.getName()); }
		 */
	}
}
