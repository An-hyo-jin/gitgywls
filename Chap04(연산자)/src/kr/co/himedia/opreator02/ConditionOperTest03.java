package kr.co.himedia.opreator02;
/*
 * 입력 1 : 7
 * 입력 2 : 9
 * 9
 */

import java.util.Scanner;

public class ConditionOperTest03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		System.out.println("입력 받은 두 수중 큰 수를 출력하세요\n");						
		
		System.out.println("입력1 : ");
		int x = scan.nextInt();
		System.out.println("입력2 : ");
		int y = scan.nextInt();
		
		int max = (x> y) ? x : y;
		System.out.println(max);
		
		scan. close();
		
		
		
	
	}

}
