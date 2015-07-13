package org.hillel.it.dreamteam.sql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.hillel.it.dreamteam.model.entity.Client;
import org.hillel.it.dreamteam.persistence.repository.ClientRepository;

public class ClientSQL extends MainDB implements ClientRepository {
/**
 * Insertion into tables clients with necessary fields
 */
	@Override
	public synchronized boolean addClient(Client client, int clientId) {
		if (startConection()) {
			try {
				if (getClientId() == null) {
					try (PreparedStatement ps = getConnection()
							.prepareStatement(
									"INSERT INTO "
											+ CLIENT_TABLE
											+ " (FIRST_NAME, LAST_NAME, EMAIL, PASSWORD, CLIENTID"
											+ ", " + COLUMN_CREATED_AT + " )"
											+ " VALUES(?,?,?,?,?,?)")) {
						ps.setString(1, client.getFirstName());
						ps.setString(2, client.getLastName());
						ps.setString(3, client.getEmail());
						ps.setString(4, client.getPassword());
						ps.setInt(5, client.getClientId());
						DateFormat dateFormat = new SimpleDateFormat(
								"dd/MM/yyyy HH:mm:ss");
						Date date = new Date();
						ps.setString(6, dateFormat.format(date));
						ps.executeUpdate();
						return true;
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			} finally {
				closeConection();
			}
		}
		return false;

	}

	private Object getClientId() {
		// TODO Auto-generated method stub
		return null;
	}
/**
 * Function that finds a client by id
 */
	@Override
	public synchronized Client findClientById(int clientId) {
		if (startConection()) {
			try {
				try (PreparedStatement ps = getConnection().prepareStatement(
						"SELECT * FROM " + CLIENT_TABLE + " WHERE "
								+ "CLIENTID = ? ")) {
					ps.setInt(1, clientId);
					try (ResultSet rs = ps.executeQuery()) {
						rs.next();
						Client client = new Client();
						client.setId(rs.getInt(1));
						client.setFirstName(rs.getString(2));
						client.setLastName(rs.getString(3));
						client.setEmail(rs.getString(4));
						client.setClientId(rs.getInt(5));

						return client;
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			} finally {
				closeConection();
			}
		}
		return null;
	}
/**
 * Function that deletes a client by id
 */
	@Override
	public synchronized boolean deleteClient(int clientId) {
		if (startConection()) {
			try {
				try (PreparedStatement ps = getConnection().prepareStatement(
						"DELETE FROM " + CLIENT_TABLE + " WHERE ID = ?")) {
					Client client = new Client();
					ps.setObject(1, client.getClientId());
					ps.executeUpdate();
					return true;
				}
			} catch (SQLException e) {
				e.printStackTrace();
				return false;
			} finally {
				closeConection();
			}

		}

		return false;
	}
/**
 * Function that gives a list with all clients and all information about them
 */
	@SuppressWarnings("rawtypes")
	@Override
	public List<Client> findAll() {
		String sql = "SELECT * FROM CUSTOMER";
		List<Client> customers = new ArrayList<Client>();

		List<Map> rows = queryForList(sql);
		for (Map row : rows) {
			Client client = new Client();
			client.setFirstName((String) (row.get("FIRST_NAME")));
			client.setLastName((String) row.get("LAST_NAME"));
			client.setEmail((String) row.get("EMAIL"));
			client.setPassword((String) row.get("PASSWORD"));
			client.setClientId((Integer) row.get("CLIENTID"));
			client.addClient(client);
		}

		return customers;
	}

	@SuppressWarnings("rawtypes")
	private List<Map> queryForList(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

}
