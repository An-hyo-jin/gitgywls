package kr.co.himedia.enmKeyWord;

enum Human { MAN, WOMAN }
enum Machine{ CAR,AIRPLANE }

public class EnumTest {
	
	public static void main(String[] args) {
		
		createUnit(Machine.CAR);
		//createUnit(Human.MAN); 			//잘못된 상수 사용 => 에러발생
		//if(Human.MAN == 0) {}				//숫자로 비교하면 에러가 생김 
	}

	public static void createUnit(Machine kind) {
		switch(kind) {
		case CAR:
			System.out.println("자동차를 만듭니다.");
			break;
		case AIRPLANE:
			System.out.println("비행기를 만듭니다");
			break;
		}
		
		
	}
	
	

}
