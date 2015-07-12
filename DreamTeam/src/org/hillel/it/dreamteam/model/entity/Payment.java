package org.hillel.it.dreamteam.model.entity;

public class Payment extends BaseEntity{
	private int amount;
	private Client client;

	public Payment(int i, Client client2) {
		this.amount = amount;
		this.client = client;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
}
