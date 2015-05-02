public class Dishes extends Order {
	public Dishes(String id, char[] dishes, int tableNumber) {
		super(id, dishes, tableNumber);
		// TODO Auto-generated constructor stub
	}

	String dishName;
	int dishCost;
	boolean dishAvailability;

	void changeDishName() {

	}

	void changeDishCost() {

	}

	void changeDishAvailability() {

	}

	public Dishes(String id, char[] dishes, int tableNumber, String dishName,
			int dishCost, boolean dishAvailability) {
		super(id, dishes, tableNumber);
		this.dishName = dishName;
		this.dishCost = dishCost;
		this.dishAvailability = dishAvailability;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public int getDishCost() {
		return dishCost;
	}

	public void setDishCost(int dishCost) {
		this.dishCost = dishCost;
	}

	public boolean isDishAvailability() {
		return dishAvailability;
	}

	public void setDishAvailability(boolean dishAvailability) {
		this.dishAvailability = dishAvailability;
	}
	
}
