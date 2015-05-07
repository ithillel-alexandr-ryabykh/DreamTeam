public class Order {
	String id;
	String[] dishes;
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

	public Order(String id, String[] dishes, int tableNumber) {
		super();
		this.id = id;
		this.dishes = dishes;
		this.tableNumber = tableNumber;
	}

}
