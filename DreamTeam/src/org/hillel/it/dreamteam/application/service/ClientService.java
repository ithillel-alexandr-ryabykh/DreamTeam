package org.hillel.it.dreamteam.application.service;

import org.hillel.it.dreamteam.model.entity.Client;

public interface ClientService {
	// adding of a new Client
	void addClient(Client client);

	// deleting of existing Client by Id
	void deleteClient(int clientId);

	// check the Client by Id
	Client findClientById(int clientId);
}
