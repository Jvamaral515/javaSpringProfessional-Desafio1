package com.devsuperior.desafio1.services;

import org.springframework.stereotype.Service;

import com.devsuperior.desafio1.entities.Order;

@Service
public class ShippingService {

	public double shippment(Order order) {
		if (order.getBasic() > 200) {
			return 0.0;
		} else if (order.getBasic() > 100) {
			return 12.0; 
		} else {
			return 20.0;
		}
	}
}
