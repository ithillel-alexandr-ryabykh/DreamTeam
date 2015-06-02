package org.hillel.it.dreamteam.model.entity;

public class Options extends BaseEntity {
	private Order order;
	private Dish dish;
	private CartItem cartItem;
	private boolean delivery;
	private boolean taxi;

	private int prepayment;// 30% of all cost,if total dish cost > X $

	public Options(boolean orderType, boolean taxi, int prepayment, int discount) {

		this.delivery = orderType;
		this.taxi = taxi;
		this.prepayment = prepayment;
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

}
