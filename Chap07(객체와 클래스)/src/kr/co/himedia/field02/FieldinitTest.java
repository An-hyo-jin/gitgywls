package kr.co.himedia.field02;

public class FieldinitTest {
	
	/*
	 * new 연산자
	 * 	- 클래스에 있는 멤버들의 바이트 크기만큼
	 * 	  heap에다가 메모리 할당을 하며 동시에 초기화를 시켜주는 역할을 함
	 */
	
	public static void main(String[] args) {
		Fieldinit fieldinit = new Fieldinit();
		
		System.out.println(fieldinit.byteField);
		System.out.println(fieldinit.booleanField);
		System.out.println(fieldinit.floatField);
		
		System.out.println(fieldinit.toString());
		
		
		
		
	}

}
