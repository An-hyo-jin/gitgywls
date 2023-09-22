package kr.co.himedia.decision03;
/*
 * Quiz)
 * 	- 80점 이상의 학생 중에서 90점 이상은 A반, 85점 이상은 B반, 그렇지 않음면 C반으로 편성하고 
 * 		점수가 80점 미만이면 불합격 처리하는 프로그램을 작성하시오. 
 * 		단, 점수는 0~100점 사이값으로 입력을 받는다. 
 * 	출력예시)
 * 	점수를 입력하세요 : 70
 * 	불합격 입니다. 
 * 
 * 	점수를 입력하세요 : 90
 * 	A반 편성입니다. 
 * 
 * 점수를 입력하세요 : 85
 * 	B반 편성입니다. 
 * 
 * 점수를 입력하세요 :  84
 * 	C반 편성입니다.
 * 
 *  점수를 입력하세요 :  200
 * 	유효한 점수가 아닙니다.
 *	*/

import java.util.Scanner;

public class IfNestedTest03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
		System.out.println("점수");
		int score = scan.nextInt();
		if(score >=0 && score <=100) {
			if(score>=80) {			
				if(score>=90) {
					System.out.println("A반");
					
				}else if(score>=85) {
					System.out.println("B반");
				}else {
					System.out.println("C반");
				}
				
				
			}else {
				System.out.println("불합격");
			}
			
			
		}else {
			System.out.println("유효한 점수가 아닙니다.");
		}
		
		scan .close();		
		
		
	}

}
