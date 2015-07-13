package org.hillel.it.dreamteam.persistence.inmemory;

import java.util.*;

import org.hillel.it.dreamteam.model.entity.Client;
import org.hillel.it.dreamteam.persistence.repository.ClientRepository;

public class InMemoryClientRepository extends InMemoryBaseRepository<Client> implements ClientRepository {

	List<Client> clients = new ArrayList<Client>();

	// function of client checking by Id
	@Override
	public Client findClientById(int clientId) {
		for (Client client : clients) {
			if (client.getId() == clientId) {
				return client;
			}
		}
		return (Client) null;
	}

	// checking if the client present,and adding if not
	@Override
	public boolean addClient(Client client, int clientId) {
		if (findClientById(client.getClientId()) == null) {
			clients.add(client);
			return true;
		}
		return false;
	}

	// deleting of existing client
	@Override
	public boolean deleteClient(int clientId) {
		int clientIndex = getClientIndex(clientId);
		if (clientIndex > 0) {
			clients.remove(clientIndex);
			return true;
		}
		return false;
	}

	// to delete the client its index should be known. Here index can be get
	private int getClientIndex(int clientId) {
		for (int i = 0; i < clients.size(); i++) {
			if (clients.get(i).clientIdEquals(clientId)) {
				return i;
			}
		}
		return -1;
	}

}
