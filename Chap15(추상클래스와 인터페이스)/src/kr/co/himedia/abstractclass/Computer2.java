package kr.co.himedia.abstractclass;	//추상클래스

public abstract class Computer2 { // abstract을 붙이게 되면 아래에  abstract 없어도 추상 클래스가 되서 아래에는 객체 생성 못함
			
	public void display() {}       
	public void typing() {}
	
	public void turnOn() {
		System.out.println(" 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

}
