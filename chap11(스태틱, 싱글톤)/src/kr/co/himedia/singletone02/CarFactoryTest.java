package kr.co.himedia.singletone02;

public class CarFactoryTest {
	
	public static void main(String[] args) {
		
//		CarFactory carFactory = CarFactory.getInstance() ;
//		Car car1 = carFactory.crateCar();
//		Car car2 = carFactory.crateCar();
//		
//		System.out.println(car1.getCarId());
//		System.out.println(car2.getCarId());
		
		CarFactory carFactory = CarFactory.getInstance();
		Car BMW = carFactory.crateCar();
		Car BMW1 = carFactory.crateCar();
		
		System.out.println(BMW.getCarNum());
		System.out.println(BMW1.getCarNum());
		
		
		
		

		
		
		
		
		
				
	}

}
