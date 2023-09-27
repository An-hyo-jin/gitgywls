package kr.co.himedia.inheritance03;

public class CustomerTest02 {
	
	public static void main(String[] args) {
		
		Customer customerL = new Customer(2023,	"이순신");
		customerL.bonusPoint = 1000;
		int priceL = customerL.calPrice(10000);
		System.out.println(customerL.showInfo()+"지불금약은"+priceL+"원 입니다.");
		
		System.out.println();
		
		//참조변수에 타입은 Customer지만 인스턴스의 타입은 VIPCustomer임(기준은 왼쪽)
		Customer customerS = new VIPCustomer(2024,"신사임당");
		int priceS = customerS.bonusPoint =10000;
		customerS.calPrice(10000);
		System.out.println(customerS.showInfo()+"지불금약은"+priceS+"원 입니다.");
		
		
	}

}
