package org.hillel.it.dreamteam.model.entity;

public enum ClientType {
	CLIENT("USER"), ADMIN("ADMIN");
	private final String type;

	private ClientType(String type) {
		this.type = type;
	}
}
