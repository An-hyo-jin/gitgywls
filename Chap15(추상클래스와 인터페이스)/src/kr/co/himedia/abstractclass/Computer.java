package kr.co.himedia.abstractclass;	//추상클래스

public abstract class Computer {
	
	abstract void display();         //new 못 만듬 추상클래스라서 
	abstract void typing();
	
	public void turnOn() {
		System.out.println(" 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

}
