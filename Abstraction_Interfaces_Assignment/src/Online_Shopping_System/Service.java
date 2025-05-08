package Online_Shopping_System;

public class Service implements Discountable {

	private String name;
    private double price;
    private double flatDiscount;
	public Service(String name, double price, double flatDiscount) {
		
		this.name = name;
		this.price = price;
		this.flatDiscount = flatDiscount;
		
		
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
	public double getFlatDiscount() {
		return flatDiscount;
	}
	public void setFlatDiscount(double flatDiscount) {
		this.flatDiscount = flatDiscount;
	}
	@Override
	public double applyDiscount() {
		// TODO Auto-generated method stub
		return price-flatDiscount;
	}
    
}
