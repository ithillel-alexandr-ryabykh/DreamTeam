import java.util.*;
public class Order {
	String id;
	List dishes = new ArrayList();
	int tableNumber;
	Client client;
	Dishes dish;
	Services service;

	void orderCancel() {

	}

	void tableAvailability() {

	}

	void timeAvailability() {

	}

	public Order(String id, List dishes, int tableNumber) {
		super();
		this.id = id;
		this.dishes = dishes;
		this.tableNumber = tableNumber;
	}

}
