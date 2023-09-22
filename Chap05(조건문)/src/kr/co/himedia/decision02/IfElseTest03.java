package kr.co.himedia.decision02;

import java.util.Scanner;

public class IfElseTest03 {
	public static void main(String[] args) {
		/*
		 * Quiz1)
		 * 정수 1개를 입력 받아서 짝수인지 홀수 인지를 판단하는 프로그램을 작성하시오. 
		 * 		-정수를 입력하세요 : 20
		 * 		짝수 입니다. 
		 * 
		 * 		-정수를 입력하세요 : 20
		 * 		 홀수 입니다. 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print ("정수를 입력하세요 : ");
		int num = scan.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("짝수 입니다.");
		}else {
			System.out.println("홀수 입니다.");
			
		}
		
		//Quiz  입력 받은 수가 12의 배수인지를 출력하는 코드를 작성하시오.
		System.out.println();
		
		
		System.out.print("정수를 입력하세요 : ");
		int num1=scan.nextInt();
				
		if(num1 % 12 == 0) {
			System.out.println("12의 배수 입니다.");
		}
		else {
			System.out.println("12의 배수가 이닙니다.");
			}
				
			/*
			 * Quiz3.  년도를 입력 받아서 해당 년도가 윤년인지 아닌지를 판단하여
			 *         출력하는 프로그램을 작성하시오. 
			 * 		-윤년 : 4의 배수인년도 이거나(100으로 나누어  떨어지는 년도를 제외하고)400의 배수인 년도
			 */
		System.out.println();
		
		System.out.print("윤년을 출력 해주세요 : ");
		int num2 =scan.nextInt();
		
		if((num2 %4== 0 && num2 != 100) || num2 %400==0 ){
			System.out.println("윤년 입니다.");
			
		} else {
			System.out.println("윤년이 아닙니다.");
			
		}
		
		
		
		
		scan.close();
		
	}

}