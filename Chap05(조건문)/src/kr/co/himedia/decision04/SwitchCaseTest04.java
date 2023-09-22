package kr.co.himedia.decision04;

import java.util.Scanner;

/*
 * Quiz)
 * - switch~case문을 활용하여 요일에 해당하는 운동을 출력하시오.
 *  	-Sunday : 야구
 *		-Monday: 농구
 *		-Tuesday :수영
 * 		-Wednesday : 수영하기
 * 		-Friday : 휴식
 * 		-Saturday :휴식  
 *
 */

public class SwitchCaseTest04 {
	
	public static void main(String[] args) {
		System.out.println("요일을 입력하세요.");
		Scanner scan = new Scanner(System.in);			
		
		
		String day = scan.next();
		switch (day) {
		case "Sunday": 
			System.out.println("야구");
			break;		
			case "Monday": 
			System.out.println("농구");
			break;
			case "Tuesday":
			System.out.println("수영");
			break;
			case "Wednesday":
				System.out.println("수영");
				break;
			case "Friday":
				System.out.println("휴식");
				break;
			case "Saturday":
				System.out.println("휴식");
				break;
			default:
				System.out.println("유효하는 날이 없습니다.");	
				
				
			
		
			
		}
		
		
				
		scan.close();
	}
}
