package org.hillel.it.dreamteam.application.service.impl;

import org.hillel.it.dreamteam.model.entity.Client;
import org.hillel.it.dreamteam.persistence.inmemory.InMemoryClientRepository;
import org.hillel.it.dreamteam.persistence.repository.ClientRepository;
import org.hillel.it.dreamteam.application.service.ClientService;

;

public class ClientServiceImpl implements ClientService {
	ClientRepository repository = new InMemoryClientRepository();

	@Override
	public void addClient(Client client) {
		repository.addClient(client);

	}

	@Override
	public void deleteClient(int clientId) {
		repository.deleteClient(clientId);

	}

	@Override
	public Client findClientById(int clientId) {

		return repository.findClientById(clientId);
	}

}
