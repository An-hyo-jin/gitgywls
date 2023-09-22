package kr.co.himedia.constructor04;

public class Monitor {
	
	//멤버변수(필드)
	String color;
	int channal;		//채널
	int volume;			//볼륨
	boolean power;		//전원(on-off)
	
	//멤버 메서드
	public void power() {
		if(!power) {
			System.out.println("모니터가 켜졌습니다.");
			this.power = !power;
		} else {
			System.out.println("모니터가 꺼졌습니다.");
			this.power = !power;			
		}
	}
	
	public void channelup() {
		this.channal++;
		System.out.println("현재채널:"+ this.channal);
	}
	public void channelDown() {
		System.out.println("현재채널:" + --(this.channal));
	}

	@Override
	public String toString() {
		return "Monitor [color=" + color + ", channal=" + channal + ", volume=" + volume + ", power=" + power + "]";
	}
	
	

}
