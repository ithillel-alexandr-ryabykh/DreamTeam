package org.hillel.it.dreamteam.application.service.impl;

import java.util.List;

import org.hillel.it.dreamteam.application.service.PaymentService;
import org.hillel.it.dreamteam.model.entity.Payment;
import org.hillel.it.dreamteam.persistence.repository.PaymentRepository;
import org.hillel.it.dreamteam.persistance.repository.impl.file.FileRepository;

public class PaymentServiceImpl implements PaymentService {
	// PaymentRepository repository = new InMemoryPaymentRepository();
	PaymentRepository repository = FileRepository.getInstance()
			.getPaymentRepository();

	@Override
	public void save(Payment payment) {
		repository.save(payment);

	}

	@Override
	public void delete(Payment payment) {
		repository.delete(payment);

	}

	@Override
	public Payment findById(int id) {

		return repository.findById(id);
	}

	@Override
	public List<Payment> findAll() {

		return repository.findAll();
	}

}
