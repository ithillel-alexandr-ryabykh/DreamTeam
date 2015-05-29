package org.hillel.it.dreamteam.persistence.repository;

import org.hillel.it.dreamteam.model.entity.Client;

public interface ClientRepository {
	//adding of a new Client
	boolean addClient(Client client, int clietnId);
	
	//deleting of existing Client by Id
	void deleteClient(Client client, int clientId);
	
	//check the Client by Id
	int getClientById(int clientId);
}
