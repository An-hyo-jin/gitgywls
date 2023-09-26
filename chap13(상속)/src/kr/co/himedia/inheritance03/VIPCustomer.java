package kr.co.himedia.inheritance03;

public class VIPCustomer extends Customer {
	
	private int agentId;   	// 상담원
	double salesRatid;		//적립 
	
	public VIPCustomer() {
		super(1000, "Lee");
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		salesRatid = 0.1;       //this 생략
		
		System.out.println("VIPCustomer() 생성자 호출");
	}
	
	public VIPCustomer(int customerId,String customerName) {
		super(customerId, customerName);
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		salesRatid = 0.1;       //this 생략
		
		System.out.println(" VIPCustomer(int customerId,String customerName) 생성자 호출");
		
	}

	public int getAgentId() {
		return agentId;
	}
	
	@Override
	public int calPrice(int price) {
		bonusPoint += price *bonusRatio;
		return price - (int)(price*salesRatid);
	}	
		
	}
	

