package kr.co.himedia.loop02;

import java.util.Scanner;

/*
 * 구구단을 출력합니다. 
 * 몇 단부터 출력 할까요?: (입력 3)
 * 끝단은 얼마인가요?      (입력 5)
 * 
 * ==========3단=============
 * 3*1=3
 * 3*2=6
 * ...
 * 3*9=27
 *  ==========4단=============
 */
public class NestedLoopTest03 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("구구단을 출력합니다.");		
		System.out.println("몇단 부터 출력할까요?");				
		int dan = scan. nextInt();
		
		System.out.println("끝단은 얼마인가요?");		
		int count = scan. nextInt();
				
		for(; dan<=count; dan++) {
			System.out.println("======="+ dan+ "단=========");
			for(int j=1; j<10; j++) {
				System.out.println(dan+"x"+j+"="+dan*j);
				
			}
			
			
		
		
			
		}
				scan.close();
	}

}
