public class Client extends Order{
	public Client(String id, char[] dishes, int tableNumber) {
		super(id, dishes, tableNumber);
		// TODO Auto-generated constructor stub
	}
	String name;
	int telNumber;
	public Client(String id, char[] dishes, int tableNumber, String name,
			int telNumber) {
		super(id, dishes, tableNumber);
		this.name = name;
		this.telNumber = telNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTelNumber() {
		return telNumber;
	}
	public void setTelNumber(int telNumber) {
		this.telNumber = telNumber;
	}
	
}
