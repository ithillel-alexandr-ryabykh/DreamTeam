package org.hillel.it.dreamteam.persistence.repository;

import java.util.List;

import org.hillel.it.dreamteam.model.entity.Client;

public interface ClientRepository {
	//adding of a new Client
	void addClient(Client client);
	
	//deleting of existing Client by Id
	void deleteClient(int clientId);
	
	//check the Client by Id
	Client findClientById(int clientId);

	List<Client> findAll();
}
