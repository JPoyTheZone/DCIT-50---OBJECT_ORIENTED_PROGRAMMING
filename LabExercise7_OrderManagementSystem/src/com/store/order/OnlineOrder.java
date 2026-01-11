package com.store.order;

import com.store.payment.Payable;

public class OnlineOrder extends Order implements Payable{

	public OnlineOrder(int orderid, int a) {
		super(orderid, a);

	}
	
	public OnlineOrder(int orderid, int a,String d) {
		super(orderid, a);
		setDetail(d);
	}

	@Override
	void processOrder() {
		/**
		if(this.getOrderStatus()==OrderStatus.PAID) {
			setStatus(OrderStatus.SHIPPED);
		}
		else {
			System.out.println("OrderStatus can't be set to Shipped, invalid status.");
		}
	**/
	}

	@Override
	public void pay() {
		setStatus(OrderStatus.PAID);
	}
	
	
	
}
