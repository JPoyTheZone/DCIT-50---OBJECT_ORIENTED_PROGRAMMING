package com.store.order;

public abstract class Order {
	private int orderID;
	private int amount;
	private OrderStatus status;
	
	private String detail = "";
	//Not sure if this is what meant by summary.
	
	Order(int orderid,int a){
		orderID = orderid;
		amount = a;
		status = OrderStatus.PENDING;
	}
	
	abstract void processOrder();
	
	public void getOrderSummary() {
		
		if (detail.length()>1) {
			System.out.println("---------------------- \n"
					+ "Order ID : "+ orderID +"\n"
					+ "Amount : "+ amount +"\n"
					+ "Status : "+ status +"\n"
					+ detail +"\n");
		}

		else {
			System.out.println("---------------------- \n"
					+ "Order ID : "+ orderID +"\n"
					+ "Amount : "+ amount +"\n"
					+ "Status : "+ status +"\n");
		}
	}
	
	
	//Setter methods for private fields
	public void setStatus(OrderStatus s) {
		status = s;
	}
	
	public void setAmount(int a) {
		amount = a;
	}
	
	public void setDetail(String d) {
		detail = d;
	}
	
	//Getter methods for all private fields
	public int getOrder() {
		return orderID;
	}

	public int getAmount() {
		return amount;
	}
	
	public OrderStatus getOrderStatus() {
		return status;
	}
	

}
