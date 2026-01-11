package com.store.main;

import java.util.ArrayList;
import java.util.Iterator;

import com.store.order.Order;
import com.store.order.OrderStatus;
import com.store.order.OnlineOrder;

public class OrderApp {
	
	
	public static void main(String[] args) {
		ArrayList<Order> orders = new ArrayList<Order>();
		
		OnlineOrder a_lamp = new OnlineOrder(1 ,1 ,"a small ergonomic lamp");
		OnlineOrder a_futon = new OnlineOrder(2, 1 ,"single size futon");
		OnlineOrder an_electricfan = new OnlineOrder(3, 1 ,"a multi function utility fan");
		
		orders.add(a_lamp);
		orders.add(a_futon);
		orders.add(an_electricfan);
		
		Iterator<Order> iterator = orders.iterator();
		
		
		//it only returns two, iteration problems maybe.
		
		while(iterator.hasNext()) {
			Order cur = iterator.next();
			
			cur.getOrderSummary();
			
			if (cur.getOrderStatus()==OrderStatus.CANCELLLED) {
				iterator.remove();
			}
		}
		
	}
}

