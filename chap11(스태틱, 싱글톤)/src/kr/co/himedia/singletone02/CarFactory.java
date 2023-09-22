package kr.co.himedia.singletone02;

public class CarFactory {  //싱글톤 패턴
	
//	private CarFactory() {}
//	
//	private static CarFactory instance = new CarFactory();
//	
//	public static CarFactory getInstance() {
//		
//		if(instance==null)
//			instance = new CarFactory();
//		return instance;
//			
//	}
//	public Car crateCar() {
//		Car car = new Car();
//		return car;
//	}
//	
	
	private static CarFactory instance = new CarFactory();
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		
		if(instance == null)
			instance = new CarFactory();
		
		return instance;		
	}
	
	public Car crateCar() {
		Car car = new Car();
		return car;
		
		
	}
	
	
	
	
}
	

