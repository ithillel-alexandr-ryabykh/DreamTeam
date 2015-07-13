package org.hillel.it.dreamteam.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainDB {

	private String url = "jdbc:mysql://localhost/restaurant";
	private Connection dbh;
	/**
	 * Creation of tables and columns with corresponding names
	 */
	public static final String CLIENT_TABLE = "Clients";
	public static final String ORDER_TABLE = "Orders";
	public static final String PAYMENT_TABLE = "Payment";
	public static final String COLUMN_CREATED_AT = "createdat DATE NOT NULL";
	public static final String COLUMN_CREATED_BY = "createdby INT";

	/**
	 * Starting a connection, if it wasn't done earlier
	 * @return true, if it was successful
	 */
	public synchronized boolean startConection() {
		try {
			if (dbh == null) {
				dbh = DriverManager.getConnection(url, "user", "password");
				return true;
			}
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
/**
 * Close a connection
 * @return true if it was closed
 */
	public synchronized boolean closeConection() {
		try {
			dbh.close();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public Connection getConnection() {
		return dbh;
	}

}
