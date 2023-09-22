package kr.co.himedia.constructor05;

public class PersonTest {
	
	public static void main(String[] args) {
		
		Person person = new Person();
	    System.out.println();
		
	    person.key = 180;
		person.weight= 70;
		person.gender ="여자";
		person.name = "신사임당";
		person.age = 35;
		
	    person.showInfo();
		
		Person person1 = new Person();
	    System.out.println();
		
		person1.key = 185;
		person1.weight= 85;
		person1.gender ="남성";
		person1.name = "이순신";
		person1.age = 40;
		
		person1.showInfo();
		
		
		
	}
	
	


}
