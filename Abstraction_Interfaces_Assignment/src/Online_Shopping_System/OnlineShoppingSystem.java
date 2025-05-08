package Online_Shopping_System;

public class OnlineShoppingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Product pro = new Product("Mobile", 15000, 10);
Service sre = new Service("Mobile Checkup", 500, 50);

System.out.println(pro.applyDiscount());
System.out.println(sre.applyDiscount());
	}

}
