package kr.co.himedia.loop05;

import java.util.Scanner;

// 입력받은 모든
public class DowhilTest {
	
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("정수를 입력하세요:");
		
		int sum = 0;
		int input ;
		
		do {
			input =scanner.nextInt();
			sum +=input;
		} while(input !=0);
		
		System.out.println("sum ="+sum);
		
		scanner.close();
		
	}

}
