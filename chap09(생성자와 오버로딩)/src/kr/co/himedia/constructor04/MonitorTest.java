package kr.co.himedia.constructor04;

public class MonitorTest {
	
	public static void main(String[] args) {
		
		Monitor monitor = new Monitor();
		System.out.println(monitor);
		
		monitor.power();
		monitor.power();
		monitor.power();
		
		monitor.channal = 50;
		monitor.channelup();
		monitor.channelDown();
		
		
		
	}

}
