package kr.co.himedia.inheritance04;

public class GoldCustomer extends Customer {

	double salesRatio;

	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade = "Gold";
		bonusRatio = 0.2;
		salesRatio = 0.1;

	}

	@Override
	public int calPrice(int price) {
		bonusPoint+= price* bonusRatio;
		return price -(int)(price*salesRatio);
		
	}
}
