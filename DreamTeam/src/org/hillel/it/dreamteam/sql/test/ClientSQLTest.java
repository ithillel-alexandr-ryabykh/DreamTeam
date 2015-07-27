package org.hillel.it.dreamteam.sql.test;

import static org.junit.Assert.*;

import org.hillel.it.dreamteam.model.entity.Client;
import org.hillel.it.dreamteam.persistence.repository.ClientRepository;
import org.hillel.it.dreamteam.sql.ClientSQL;
import org.junit.Test;

public class ClientSQLTest {

	ClientRepository rep = new ClientSQL();
	Client client = new Client("Ivan","Ivanov","lost@i.ua", "123", "9379992");
		@Test
		public void testAddUser() {
			assertEquals(false, rep.addClient(client, 0));
		}
		@Test
		public void testGetUser() {
			equals(rep.findClientById(1));
		}


}
