package kr.co.himedia.singletone02;

/*
 * 자동차 공장이 있습니다. 
 * 자동차 공장은 유일한 객체이고, 이 공장에서 생산되는 자동차는 생산 될 때마다 고유의 차번호가 부여됩니다. 
 * 
 *  자동차 번호가 1001부터 시작되어 차가 생산될 때 마다
 *  1002, 1003번 이렇게 번호가 부여 되도록 자동차 공장클래스(싱클톤 패턴 적용), 자동차 클래스(static 변수)를 구현하시오. 
 *  
 *  -출력예시
 * 		1001
 * 		1002
 * 
 */

public class Car {
	
//	public static int serialNum = 1000;
//	private int carId;
//	private String carName;
//	
//	public Car() {
//		Car.serialNum++;
//		this.carId= serialNum;		
//	}
//
//	public static int getSerialNum() {
//		return serialNum;
//	}
//
//	public static void setSerialNum(int serialNum) {
//		Car.serialNum = serialNum;
//	}
//
//	public int getCarId() {
//		return carId;
//	}
//
//	public void setCarId(int carId) {
//		this.carId = carId;
//	}
//
//	public String getCarName() {
//		return carName;
//	}
//
//	public void setCarName(String carName) {
//		this.carName = carName;
//	}
//	
		
	private  static int seriaNum = 1000;
	private int carNum;
	
	public Car() { 		//생성자
		seriaNum++;
		carNum = seriaNum;
	}

	public int getCarNum() {
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	
	

	
	
	

}
