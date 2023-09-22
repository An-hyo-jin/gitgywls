package kr.co.himedia.decision03;

import java.util.Scanner;

public class IfElseIfTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요");
		int score =  scanner.nextInt();
		
		if (score >= 90) {
			System.out.println("점수가 90~100점 사이 입니다. ");
			System.out.println("등급은 A등급 입니다. ");
		}
		else if (score >= 80) {
			System.out.println("점수가 80~90점 사이 입니다. ");
			System.out.println("등급은 B등급 입니다. ");
		}
		else if  (score >= 70) {
			System.out.println("점수가 70~79점 사이 입니다. ");
			System.out.println("등급은 C등급 입니다. ");
			
		}
		else if(score >= 60) {
			System.out.println("점수가 60~69점 사이 입니다. ");
			System.out.println("등급은 D등급 입니다. ");
			
		}
		else{
			System.out.println("등급은 F 입니다.");
		}
		
		scanner.close();
		
		
	}

	
}
	
	
	
	
	
	

	

