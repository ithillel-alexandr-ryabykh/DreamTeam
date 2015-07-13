package org.hillel.it.dreamteam.application.service;

import java.util.List;

import org.hillel.it.dreamteam.model.entity.Client;

public interface ClientService {
	/**
	 * Adding of a new Client
	 * @param client to declare new client
	 */
	void addClient(Client client);

	/**
	 * Deleting of existing Client by Id
	 * @param clientId unique client id
	 */
	void deleteClient(int clientId);

	/**
	 * Check the Client by Id
	 * @param clientId unique client id
	 * @return list in which selected client is deleted
	 */
	Client findClientById(int clientId);
	
	/**
	 * Get full client list
	 * @return all list of clients
	 */
	List<Client> findAll();
}
