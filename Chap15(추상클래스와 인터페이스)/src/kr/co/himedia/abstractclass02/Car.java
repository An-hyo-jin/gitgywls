package kr.co.himedia.abstractclass02;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	final public void run() {   // 시나리오 정의함(변경 불가라서 final을 붙힘)
		startCar();
		drive();
		stop();
		turnOff();
	}

}
