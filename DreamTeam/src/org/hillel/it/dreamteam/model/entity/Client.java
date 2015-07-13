package org.hillel.it.dreamteam.model.entity;

import java.util.ArrayList;

public class Client extends BaseEntity {
	/**
	 * @clientType to designate who wants to log in
	 */
	private String firstName;
	private String lastName;
	private String email;
	private String telNumber;
	private ClientType clientType;
	private int clientId;
	private String password;
	private ArrayList payments;

	public Client(String firstName, String lastName, String email,
			String password, String telNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.telNumber = telNumber;
	}

	public Client() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Checking if this client already exists
	 * @param clientId stands for unique client id
	 * @return the identity
	 */
	public boolean clientIdEquals(int clientId) {
		return this.clientId==clientId;
	}

	public ClientType getClientType() {
		return clientType;
	}

	public void setClientType(ClientType clientType) {
		this.clientType = clientType;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public ArrayList getPayments() {
		return payments;
	}

	public void setPayments(ArrayList payments) {
		this.payments = payments;
	}

	public void addClient(Client client) {
		// TODO Auto-generated method stub
		
	}

}
