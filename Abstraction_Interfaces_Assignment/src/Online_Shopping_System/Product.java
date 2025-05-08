package Online_Shopping_System;

public class Product implements Discountable {
	private String name;
	private double price;
	private double discountPercentage;
	

	public Product(String name, double price, double discountPercentage) {
		
		this.name = name;
		this.price = price;
		this.discountPercentage = discountPercentage;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getDiscountPercentage() {
		return discountPercentage;
	}


	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}


	@Override
	public double applyDiscount() {
		// TODO Auto-generated method stub
		return price-(price*discountPercentage/100);
	}

}
