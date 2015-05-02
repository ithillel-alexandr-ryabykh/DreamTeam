public class Order extends RestaurantAdmin {
	String id;
	char[] dishes;
	int tableNumber;

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
