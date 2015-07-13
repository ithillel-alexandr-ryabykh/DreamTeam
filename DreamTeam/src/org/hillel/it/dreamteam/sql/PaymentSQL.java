package org.hillel.it.dreamteam.sql;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.hillel.it.dreamteam.model.entity.Payment;
import org.hillel.it.dreamteam.persistence.repository.PaymentRepository;

public class PaymentSQL extends MainDB implements PaymentRepository{

	@SuppressWarnings("null")
	@Override
	public synchronized Payment findById(int id) {
		if (startConection()) {
			try {
				if (getAmount() == null) {
					try (PreparedStatement ps = getConnection()
							.prepareStatement(
									"INSERT INTO "
											+ CLIENT_TABLE
											+ " (ID INT PRIMARY KEY, AMOUNT INT, CLIENTID INT"
											+ COLUMN_CREATED_AT + " )"
											+ " VALUES(?,?)")) {
						Payment payment = null;
						ps.setInt(1, payment.getAmount());
						ps.setObject(2, payment.getClient());
						DateFormat dateFormat = new SimpleDateFormat(
								"dd/MM/yyyy HH:mm:ss");
						Date date = new Date();
						ps.setString(3, dateFormat.format(date));
						ps.executeUpdate();
						return payment;
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


	private Object getAmount() {
		// TODO Auto-generated method stub
		return null;
	}


	@SuppressWarnings("unused")
	@Override
	public synchronized void delete(Payment payment) {
		if (startConection()) {
			try {
				try (PreparedStatement ps = getConnection().prepareStatement(
						"DELETE FROM " + PAYMENT_TABLE + " WHERE ID = ?")) {
					Payment payment1 = new Payment(0, null); 
					ps.setObject(1, payment.getClient());
					ps.executeUpdate();
					return;
				}
			} catch (SQLException e) {
				e.printStackTrace();
				return;
			} finally {
				closeConection();
			}

		}

		return;
	}


	

	@SuppressWarnings("rawtypes")
	@Override
	public List<Payment> findAll() {
		String sql = "SELECT * FROM PAYMENT";
		List<Payment> payment1 = new ArrayList<Payment>();

		List<Map> rows = queryForList(sql);
		for (Map row : rows) {
			Payment payment = new Payment(0, null);
			payment.setAmount((Integer) (row.get("AMOUNT")));
			payment.setClient((Integer) row.get("CIENTID"));
			payment.addPayment(payment);
		}

		return payment1;
	}


	@SuppressWarnings("rawtypes")
	private List<Map> queryForList(String sql) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void save(Payment payment) {
		// TODO Auto-generated method stub
		
	}

}
