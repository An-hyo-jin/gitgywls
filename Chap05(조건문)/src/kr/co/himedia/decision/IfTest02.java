package kr.co.himedia.decision;

import java.util.Scanner;

public class IfTest02 {
	
	public static void main(String[] args) {
		// Quiz1
		// x의 값이 0보다 큰 경우에만 "양수 입니다" 출력하시오.
		
		int x = 10;
		
		if (x>0) {
			System.out.println("양수입니다.");
		}
		
		/*
		 * Quzi2
		 * 정수 1개를 입력 받아 입력된 수가 7의 배수인지를 출력하시오.
		 * 	- 정수를 입력하세요 :7
		 * 		7은 7의 배수 입니다. 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int y = scan.nextInt();
		if(y%7 == 0) {
			System.out.println("y = "+y +"은 7의 배수 입니다.");
		}
		
		/*
		 * Quzi3
		 * 나이를 입력 받아 19세 이상이면 성인임을 출력하는 코드를 작성하시오.
		 * 	- 나이를 입력하세요: 19	
		 * 		성인입니다.
		 */
		System.out.println("나이를 입력하세요 :");
		int age = scan.nextInt();
		if(age>=19) {
			System.out.println("age = 성인입니다.");
		}
		
		
		scan.close();
		
		
	
		
		
	}

}
