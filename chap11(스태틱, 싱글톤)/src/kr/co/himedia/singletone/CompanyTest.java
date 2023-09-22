package kr.co.himedia.singletone;

public class CompanyTest {
	
	public static void main(String[] args) {
		//같은 객체임 주소 같음
		Company.getInstance();
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
		
		if(company1.equals(company2)) {				//주소 비교  equals 주소 비교연산자
			System.out.println("같은 객체 입니다.");
		}else {
			System.out.println("다른 객체 입니다.");
		}
		
		if (company1 == company2 ) {					// == 연산자 : 주소값 비교
			System.out.println("같은 객체 입니다.");
		}else {
			System.out.println("다른 객체 입니다.");
		}
	}

}
