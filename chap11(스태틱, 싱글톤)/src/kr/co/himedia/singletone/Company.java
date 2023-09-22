package kr.co.himedia.singletone;

public class Company {
	//싱글톤 패턴 연습
	private Company() {}
		
	private static Company instance = new Company(); 
	
	public static Company getInstance() {
		
		if(instance == null)
			instance = new Company();		
		return instance;
		
	}
	
}
