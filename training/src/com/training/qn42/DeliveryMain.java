package com.training.qn42;

public class DeliveryMain {

	public static void main(String[] args) {
		Delivery delivery = new Delivery();
		delivery.displayDeliveryDetails("Ravichandran Aswin", "Virat Kohli");
		delivery.displayDeliveryDetails(2L);
		delivery.displayDeliveryDetails(6L);
		delivery.displayDeliveryDetails(4L);
	}

}
