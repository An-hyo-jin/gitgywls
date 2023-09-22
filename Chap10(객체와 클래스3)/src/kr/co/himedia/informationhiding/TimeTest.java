package kr.co.himedia.informationhiding;

public class TimeTest {
	
	public static void main(String[] args) {
		
		Time time = new Time();
		//time.setHour(-20);
		time.setHour(10);
		//System.out.println(time.getHour());
		
//		Time time1 = new Time();
//		time1.setHour(5);
//		time1.setMinute(30);				
//		time1.setSecond(59);
//		System.out.println(time1);
//		//System.out.println(time1.toString());
//		
		time.setHour(50);
		time.setMinute(100);
		time.setSecond(100);
		System.out.println(time);
		
		
	}

}
