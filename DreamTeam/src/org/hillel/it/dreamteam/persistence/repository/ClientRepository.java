package org.hillel.it.dreamteam.persistence.repository;

import org.hillel.it.dreamteam.model.entity.Client;

public interface ClientRepository {
	int addClient(Client client);

	int deleteClient(String firstName, String lastName, Client client);
}
