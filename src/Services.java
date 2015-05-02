public class Services {

	boolean orderType;
	boolean taxy;
	int prepayment;

	void dishCost() {

	}

	public Services(String id, char[] dishes, int tableNumber,
			boolean orderType, boolean taxy, int prepayment) {

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
