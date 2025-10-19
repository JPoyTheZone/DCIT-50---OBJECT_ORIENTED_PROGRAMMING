package Pckge;

import java.util.HashMap;

public class Customer {
	String name;
	int points;
	static int totalCustomers;
	
	int id=totalCustomers;
	
	static Object[][] CustomersNPoints = {};
	
	protected void addCustomers() {

		Object[][] CUSTOMERS = new Object[CustomersNPoints.length+1][];
		
		if (CustomersNPoints.length == 0){

			Object[] Cache = {this.name,this.points};
			CUSTOMERS[0] = Cache;
			CustomersNPoints = CUSTOMERS;
		}
		else {

			for (int i=0; i < CUSTOMERS.length ; i++) {

				if (i < CustomersNPoints.length) {

					
					CUSTOMERS[i] = CustomersNPoints[i];
					

				}	
				else if(i==CustomersNPoints.length) {
					

					
					Object[] Cache = {this.name,this.points};
					CUSTOMERS[i] = Cache;

					CustomersNPoints = CUSTOMERS;

				}
		}

		}
	}
	
	Customer(){
		name = "Unknown";
		points = 0;
		totalCustomers +=1;
		
		addCustomers();
	}
	
	Customer(String n){
		name = n;
		points = 0;
		totalCustomers +=1;
		
		addCustomers();
	}
	
	Customer(String n,int p){
		name = n;
		points = p;
		totalCustomers +=1;
		
		addCustomers();
	}
	
	Customer(Customer c){
		name = c.name;
		points = c.points;
	}
	
	
	
	public void addPoints(int i){
		
		points += i;
		System.out.println("\n"+name +" earned "+i +" points. Total points: "+ points);
	
		CustomersNPoints[id][1]=points;
	
	}
	
	public void redeemReward() {
		if (this.points >= 100) {
		points -= 100;
		System.out.println("\n"+"Congratulations "+name+"! You redeemed a free drink! \nRemaining Points: "+points);
		CustomersNPoints[id][1]=points;
		}
		else {
		System.out.println("\n"+name+" does not have enough points to redeem a drink.");
		}
	}
	
	public void displayCustomerInfo() {
    	System.out.println("Customer :"+name);
    	System.out.println("Points: "+points);
    	System.out.println("-".repeat(25));
	}
	
	
	static void displayTotalCustomers() {
		
		
		
		System.out.println("\n"+"=== Customer Information ===");
		
	    for(int i=0;i<CustomersNPoints.length;i++) {
	    	
	    	System.out.println("Customer : "+CustomersNPoints[i][0]);
	    	System.out.println("Points : "+CustomersNPoints[i][1]);
	    	System.out.println("-".repeat(25));
	    	
	    }
	    
	    System.out.println("Total Registered Customers: "+totalCustomers);
	    
	}

	static void getAllowedRewardsRedemption(Customer p) {
			
			System.out.println("\n"+p.name+" can redeem "+p.points+" reward(s).");
			
	}
	
	
}
