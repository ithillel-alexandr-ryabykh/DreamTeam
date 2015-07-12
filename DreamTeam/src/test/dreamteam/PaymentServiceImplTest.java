package test.dreamteam;

import static org.junit.Assert.*;
import java.util.List;

import org.hillel.it.dreamteam.application.service.PaymentService;
import org.hillel.it.dreamteam.application.service.impl.PaymentServiceImpl;
import org.hillel.it.dreamteam.model.entity.Payment;
import org.hillel.it.dreamteam.model.entity.Client;
import org.junit.Before;
import org.junit.Test;

public class PaymentServiceImplTest {

	private PaymentService repository;
	private Payment payment;
	private Payment payment1;
	private Payment payment2;

	@Before
	public void setup() {
		repository = new PaymentServiceImpl();

		Client client = new Client("Ivan", "Ivanov", "lost@i.ua", "12345", "9379992");

		payment = new Payment(5, client);
		payment1 = new Payment(10, client);
		payment2 = new Payment(20, client);
	}

	@Test
	public void testSaveFirstNewPayment() {
		repository.save(payment);
		assertEquals(repository.findById(1).getAmount(), 0);
	}

	@Test
	public void testChangePayment() {
		repository.save(payment);
		payment.setAmount(10);
		repository.save(payment);
		assertEquals(repository.findById(payment.getId()).getAmount(), 10);
	}

	@Test
	public void testDeletePayment() {
		repository.save(payment);
		repository.delete(payment);
		assertEquals(repository.findById(payment.getId()), null);
	}

	@Test
	public void testFindByIdIfItExists() {
		repository.save(payment);
		repository.save(payment1);
		repository.save(payment2);
		assertEquals(repository.findById(3).getAmount(), 0);
	}

	@Test
	public void testFindByIdIfDoesntExist() {
		repository.save(payment);
		repository.save(payment1);
		repository.save(payment2);
		assertEquals(repository.findById(999), null);
	}

	@Test
	public void testFindAllTrue() {
		repository.save(payment);
		repository.save(payment1);
		repository.save(payment2);
		List<Payment> payments = repository.findAll();
		assertEquals(payments.size(), 11);
	}

	@Test
	public void testFindAllNoPayments() {
		List<Payment> payments = repository.findAll();
		assertEquals(payments.size(), 11);
	}

}
