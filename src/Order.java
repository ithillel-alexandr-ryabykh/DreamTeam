public class Order {
	String id;
	char[] dishes;
	int tableNumber;
	Client client;
	Dishes dish;
	Services service;

	void dishAvailability() {

	}

	void tableAvailability() {

	}

	void timeAvailability() {

	}

	public Order(String id, char[] dishes, int tableNumber) {
		super();
		this.id = id;
		this.dishes = dishes;
		this.tableNumber = tableNumber;
	}

}
