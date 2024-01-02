package com.devsuperior.desafio1;

import java.util.Locale;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.devsuperior.desafio1.entities.Order;
import com.devsuperior.desafio1.services.OrderService;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class Desafio1Application implements CommandLineRunner{
	
	
	public OrderService orderService;
	
	public Desafio1Application (OrderService orderService) {
		this.orderService = orderService;
	}

		public static void main(String[] args) {
			SpringApplication.run(Desafio1Application.class, args);
		}
	
		@Override
		public void run(String... args) throws Exception {	
			Locale.setDefault(Locale.US);
			
			Order order = new Order(1034, 150.0, 20.0);
			System.out.printf("Pedido código %d%n", order.getCode());
			System.out.printf("Valor total: %.2f%n", orderService.total(order));
		}

}
