package org.hillel.it.dreamteam.starter;

import java.util.ArrayList;
import java.util.List;

import org.hillel.it.dreamteam.application.service.OrderService;
import org.hillel.it.dreamteam.application.service.ClientService;
import org.hillel.it.dreamteam.application.service.PaymentService;
import org.hillel.it.dreamteam.application.service.impl.OrderServiceImpl;
import org.hillel.it.dreamteam.application.service.impl.ClientServiceImpl;
import org.hillel.it.dreamteam.application.service.impl.PaymentServiceImpl;
import org.hillel.it.dreamteam.model.entity.Client;
import org.hillel.it.dreamteam.model.entity.Payment;

public class Starter {
	public static void main(String[] args) {
		Client client1 = new Client();
		Client client2 = new Client();
		Client client3 = new Client();
		client1.setFirstName("Bob");
		client2.setFirstName("Sam");
		client3.setFirstName("Alice");
		Payment payment = new Payment(20, client1);
		payment.setAmount(5);
		payment.setClient(client1);
		client1.getPayments().add(payment);
		ClientService clients = new ClientServiceImpl();
		PaymentService payments = new PaymentServiceImpl();
		clients.addClient(client1);
		payments.save(payment);
		List<Client> clientsFromFile = clients.findAll();
		if (clientsFromFile.size() > 0) {
			for (Client clientToPrint : clientsFromFile) {
				System.out.println(clientToPrint.getFirstName());
			}
		} else {
			System.out.println("No Users in file");
			clients.addClient(client1);
			clients.addClient(client2);
			clients.addClient(client3);
		}
		System.out.println(((Payment) clientsFromFile.get(0).getPayments().get(0)).getAmount());
		System.out
				.println(clients.findAll().get(0).getPayments().get(0) == payments
						.findAll().get(0));

	}

}
