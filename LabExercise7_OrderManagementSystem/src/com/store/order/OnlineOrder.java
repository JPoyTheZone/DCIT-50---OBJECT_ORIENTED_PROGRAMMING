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
		
	}

	@Override
	public void pay() {
		setStatus(OrderStatus.PAID);
	}
	
	
	
}
