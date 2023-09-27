package kr.co.himedia.inheritance02;

public class VIPCustomer extends Customer {
	
	private int agentId;   	// 상담원
	double salesRatid;		//적립 
	
	public VIPCustomer() {
		//super();
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		salesRatid = 0.1;       //this 생략
		
		System.out.println("VIPCustomer() 생성자 호출");
			}

	public int getAgentId() {
		return agentId;
	}
		
	
}
