package kr.co.himedia.global;

class Cat {
		static int global = 5;			//static 변수( 전역 변수, 공유 변수)
		int num = 3;					// 인스턴스 (instance)변수
		
		public void printValue(int num) {
			this.num = num;
			System.out.println("num: "+this.num);
			System.out.println("global :"+Cat.global);   		//static 맴버 접근 방법 => 클래스 이름. 멤버변수
		}
		
}


public class Globalvariable {
	
	public static void main(String[] args) {		     //프로그램 시작 지점
		int num1 = 5;
		int num2 = 2;									//지역변수
		
		System.out.println(num1 + ","+ num2);
		
		Cat cat1 = new Cat();							// 지역변수(참조변수) => 스택 영역에 생성
		cat1.num =1;
		Cat.global = 10;
		
		cat1.printValue(20);
		System.out.println(cat1.num);
		System.out.println(Cat.global);
		//System.out.println(cat1.global);
		
		System.out.println();
		
		Cat cat2 = new Cat();						// 지역변수(참조변수) => 스택 영역에 생성
		cat1.num =1;						
		cat2.num =2;
		Cat.global = 11;
		cat2.printValue(10);
		System.out.println(cat2.num);
		System.out.println(Cat.global);
		
		
	}

}
