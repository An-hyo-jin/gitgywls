package kr.co.himedia.global03;

public class Employee {
	public static int serialNum = 1000;
	private int employeeId;
	private String employeeName;
	private String department;
	
	
	public Employee() {
		Employee.serialNum++;
		this.employeeId = serialNum;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		int i = 0;				//로컬(지역) 변수   스택에 올려 져 있음
		//employeeName = "Lee"; //인스턴스 변수(위에 스태틱이 없음, new 해야지만 사용가능) - 객체 생성 전에 호출할 수 없다.
		Employee.serialNum = serialNum;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	

}
