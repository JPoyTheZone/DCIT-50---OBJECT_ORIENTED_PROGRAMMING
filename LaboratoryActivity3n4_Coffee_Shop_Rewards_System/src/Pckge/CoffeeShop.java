package Pckge;

public class CoffeeShop {
	
	
	public static void main(String[] args) {
		
		Customer Joseph = new Customer("Joseph");
		Customer Peter = new Customer("Peter");
		Customer Customer3 = new Customer();
		
		Peter.addPoints(200);
		Peter.addPoints(20);
		
		Joseph.redeemReward();
		Peter.redeemReward();
		
		Customer.displayTotalCustomers();
		
		Customer Diane = new Customer("Diane");
		Diane.addPoints(50);
		
		Customer.displayTotalCustomers();
		
		Customer.getAllowedRewardsRedemption(Peter);

	}
}
