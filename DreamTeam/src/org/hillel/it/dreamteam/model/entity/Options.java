package org.hillel.it.dreamteam.model.entity;

public class Options extends BaseEntity {
	private Order order;
	private boolean delivery;
	private boolean taxi;
	private int discount;// if total dish cost is more than X $
	private int prepayment;// 30% of all cost,if total dish cost > X $

	void dishCost() {

	}

	public Options(boolean orderType, boolean taxi, int prepayment, int discount) {

		this.delivery = orderType;
		this.taxi = taxi;
		this.prepayment = prepayment;
		this.discount = discount;
	}

	public boolean isOrderType() {
		return delivery;
	}

	public void setOrderType(boolean orderType) {
		this.delivery = orderType;
	}

	public boolean istaxi() {
		return taxi;
	}

	public void settaxi(boolean taxi) {
		this.taxi = taxi;
	}

	public int getPrepayment() {
		return prepayment;
	}

	public void setPrepayment(int prepayment) {
		this.prepayment = prepayment;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

}
