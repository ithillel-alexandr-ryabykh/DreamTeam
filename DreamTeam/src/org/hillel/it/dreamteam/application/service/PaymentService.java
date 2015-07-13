package org.hillel.it.dreamteam.application.service;

import java.util.List;

import org.hillel.it.dreamteam.model.entity.Payment;

public interface PaymentService {
	/**
	 * To save new payment
	 * @param payment new instance payment
	 */
	void save(Payment payment);
	
/**
 * To delete existing payment
 * @param payment existing instance payment
 */
	void delete(Payment payment);

	/**
	 * To find existing payment by unique id
	 * @param id unique id of existing payment
	 * 
	 */
	Payment findById(int id);

	/**
	 * To get all payments in a list
	 * @return list of payments
	 */
	List<Payment> findAll();
}
