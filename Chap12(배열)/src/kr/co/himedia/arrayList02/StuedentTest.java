package kr.co.himedia.arrayList02;

import kr.co.himedia.arrayList02.Student;

/*
 * 	HiMedia 학원에 학생이 3명 있습니다. 
 * 	각 학생마다 읽은 책을 기록하고 있습니다. 
 * 	학생마다 읽은 책은 Student 클래스 내에 ArrayList를 생성하여 관리하도록 합니다. 
 * 	
 * 	결과예시)
 * 	Lee 학생이 읽은 책은 : 운영체제1, 운영체제2 입니다. 
 * 	Shin 학생이 읽은 책은 : 딥러닝1, 딥러닝2, 딥러닝3 입니다. 
 *  Kim 학생이 읽은 책은 : 머신러닝1, 머신러닝2, 머신러닝3, 머신러닝4, 머신러닝5, 머신러닝6 입니다. 
 */

public class StuedentTest {
	
	public static void main(String[] args) {
		
		Student studentL = new Student(20231001, "Lee");
		studentL.addBook("운영체제1","강민철");
		studentL.addBook("운영체제2","강민철");
		
		Student studentL1 = new Student(20231001, "shin");
		studentL1.addBook("딥러닝1","박강현");
		studentL1.addBook("딥러닝2","박강현");
		studentL1.addBook("딥러닝3","박강현");
		
		Student studentL2 = new Student(20231001, "kim");
		studentL2.addBook("머니러닝1"," 오레오");
		studentL2.addBook("머니러닝2"," 오레오");
		studentL2.addBook("머니러닝3"," 오레오");
		studentL2.addBook("머니러닝4"," 오레오");
		studentL2.addBook("머니러닝5"," 오레오");
		studentL2.addBook("머니러닝6"," 오레오");
		
		studentL. showInfo();
		studentL1. showInfo();
		studentL2. showInfo();
		
		
		
		
		
		
		
		
		
		
	
	}


}
