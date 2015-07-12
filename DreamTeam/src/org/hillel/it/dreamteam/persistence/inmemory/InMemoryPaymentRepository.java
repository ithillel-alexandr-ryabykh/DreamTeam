package org.hillel.it.dreamteam.persistence.inmemory;

import org.hillel.it.dreamteam.model.entity.Payment;
import org.hillel.it.dreamteam.persistence.repository.PaymentRepository;

public class InMemoryPaymentRepository extends InMemoryBaseRepository<Payment>
		implements PaymentRepository {

}
