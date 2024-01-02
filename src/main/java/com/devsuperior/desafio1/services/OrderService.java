package com.devsuperior.desafio1.services;

import org.springframework.stereotype.Service;

import com.devsuperior.desafio1.entities.Order;

@Service
public class OrderService {
	
	private ShippingService shippingService;
	
	public OrderService(ShippingService shippingService) {
		this.shippingService = shippingService;
	}
	
	public double total (Order order) {
		return order.getBasic() - (order.getBasic() * order.getDiscount()/100) + shippingService.shippment(order);
	}
}