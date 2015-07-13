package org.hillel.it.dreamteam.model.entity;

public class Payment extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int amount;
	private Client clientID;

	public Payment(int i, Client client2) {
		this.amount = amount;
		this.clientID = clientID;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Client getClient() {
		return clientID;
	}

	public void setClient(Client client1) {
		this.clientID = client1;
	}

	public void addPayment(Payment payment) {
		// TODO Auto-generated method stub
		
	}

	public void setClient(Integer integer) {
		// TODO Auto-generated method stub
		
	}
	
}
