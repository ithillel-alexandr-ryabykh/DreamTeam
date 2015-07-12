package org.hillel.it.dreamteam.persistance.repository.impl.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import org.hillel.it.dreamteam.model.entity.Payment;
import org.hillel.it.dreamteam.model.entity.Client;
import org.hillel.it.dreamteam.model.entity.Dish;
import org.hillel.it.dreamteam.model.entity.Order;
import org.hillel.it.dreamteam.persistence.repository.ClientRepository;
import org.hillel.it.dreamteam.persistence.repository.OrderRepository;

public class FileRepository {

	private static FileRepository instance;
	private FileDishRepository dishRepository;
	private FileOrderRepository orderRepository;
	private FileClientRepository clientRepository;
	private FilePaymentRepository paymentRepository;

	protected FileRepository() {
		dishRepository = new FileDishRepository();
		orderRepository = new FileOrderRepository();
		clientRepository = new FileClientRepository();
		paymentRepository = new FilePaymentRepository();
		deserialize();
	}

	protected FileRepository(int number) {

	}

	public static FileRepository getInstance() {
		if (instance == null) {
			instance = new FileRepository();
		}
		return instance;
	}

	public void serialize() {

		try (FileOutputStream fos = new FileOutputStream("filerepository.bin");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(dishRepository.getStorage());
			oos.writeObject(orderRepository.getStorage());
			oos.writeObject(clientRepository.getStorage());
			oos.writeObject(paymentRepository.getStorage());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings({ "unchecked" })
	public void deserialize() {
		try (FileInputStream fis = new FileInputStream("filerepository.bin");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			dishRepository
					.setStorage((HashMap<Integer, Dish>) ois.readObject());
			orderRepository.setStorage((HashMap<Integer, Order>) ois
					.readObject());
			clientRepository.setStorage((HashMap<Integer, Client>) ois
					.readObject());
			paymentRepository.setStorage((HashMap<Integer, Payment>) ois
					.readObject());
		} catch (FileNotFoundException e) {
			System.out.println("present");
			dishRepository.setStorage(new HashMap<Integer, Dish>());
			orderRepository.setStorage(new HashMap<Integer, Order>());
			clientRepository.setStorage(new HashMap<Integer, Client>());
			paymentRepository.setStorage(new HashMap<Integer, Payment>());

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public FileDishRepository getDishRepository() {
		return dishRepository;
	}

	public FileOrderRepository getReservationRepository() {
		return orderRepository;
	}

	public FileClientRepository getUserRepository() {
		return clientRepository;
	}

	public FilePaymentRepository getPaymentRepository() {
		return paymentRepository;
	}

	public ClientRepository getClientRepository() {
		// TODO Auto-generated method stub
		return null;
	}

	public OrderRepository getOrderRepository() {
		// TODO Auto-generated method stub
		return null;
	}

}
