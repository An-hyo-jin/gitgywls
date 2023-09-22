package kr.co.himedia.constructor03;

public class StudentTest {
	
	public static void main(String[] args) {
		//기본 생성자 호출
		Student student = new Student();
		System.out.println(student.getName());
		System.out.println(student.getAge());
		
		System.out.println();
		
		// 매개변수가 String, int 타입이 있는 생성자 
		Student Student =new Student("신사입당",39);
		System.out.println(Student.toString());
		System.out.println();
		
		// 매개변수 String만 있는 생성자 호출
		Student Student1 =new Student("신사임당");
		System.out.println(Student1.toString());
		System.out.println();
		
		System.out.println();
		// 매개변수 int만 있는 생성자 호출
		Student Student2 =new Student(39);
		System.out.println(Student2.toString());
		System.out.println();
		
	}

}
