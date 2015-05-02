public class RestaurantAdmin {
	double time;
	double date;
	int[] tables;
	char[] ordersForDay;
	Order order;

	void orderCancel() {

	}

	public RestaurantAdmin(double time, double date, int[] tables,
			char[] ordersForDay) {
		super();
		this.time = time;
		this.date = date;
		this.tables = tables;
		this.ordersForDay = ordersForDay;
	}

	public RestaurantAdmin() {
		// TODO Auto-generated constructor stub
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public double getDate() {
		return date;
	}

	public void setDate(double date) {
		this.date = date;
	}

	public int[] getTables() {
		return tables;
	}

	public void setTables(int[] tables) {
		this.tables = tables;
	}

	public char[] getOrdersForDay() {
		return ordersForDay;
	}

	public void setOrdersForDay(char[] ordersForDay) {
		this.ordersForDay = ordersForDay;
	}

}
