import java.util.Date;

public class RestaurantAdmin {
	Date date;
	int[] tables;
	String[] ordersForDay;
	Order order;

	

	public RestaurantAdmin(double time, double date, int[] tables,
			String[] ordersForDay) {
		super();
		this.tables = tables;
		this.ordersForDay = ordersForDay;
	}

		
	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public int[] getTables() {
		return tables;
	}

	public void setTables(int[] tables) {
		this.tables = tables;
	}

	public String [] getOrdersForDay() {
		return ordersForDay;
	}

	public void setOrdersForDay(String[] ordersForDay) {
		this.ordersForDay = ordersForDay;
	}

}
