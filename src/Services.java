public class Services extends Order {
	public Services(String id, char[] dishes, int tableNumber) {
		super(id, dishes, tableNumber);
		// TODO Auto-generated constructor stub
	}
	boolean orderType;
	boolean taxy;
	int prepayment;
	void dishCost(){
		
	}
	public Services(String id, char[] dishes, int tableNumber,
			boolean orderType, boolean taxy, int prepayment) {
		super(id, dishes, tableNumber);
		this.orderType = orderType;
		this.taxy = taxy;
		this.prepayment = prepayment;
	}
	public boolean isOrderType() {
		return orderType;
	}
	public void setOrderType(boolean orderType) {
		this.orderType = orderType;
	}
	public boolean isTaxy() {
		return taxy;
	}
	public void setTaxy(boolean taxy) {
		this.taxy = taxy;
	}
	public int getPrepayment() {
		return prepayment;
	}
	public void setPrepayment(int prepayment) {
		this.prepayment = prepayment;
	}
	
}
