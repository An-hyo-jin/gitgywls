package kr.co.himedia.interface01;

public interface RemoteControl {
	
	//상수 (static final 생략됨)
	int MAX_VOLUMN = 10;
	int MIN_VOLUMN = 0;
	
	//추상메서드(abstract 생략됨)
	public void turnOn();
	public void thrnOff();
	public void setVolume(int volume);
	
}
