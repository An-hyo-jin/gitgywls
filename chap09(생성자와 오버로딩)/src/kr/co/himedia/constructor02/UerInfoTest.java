package kr.co.himedia.constructor02;

public class UerInfoTest {
	
	public static void main(String[] args) {
		
		UserInfo userInfo0 = new UserInfo();
		userInfo0. userId = "hello";
		userInfo0.userPassWord = "0303";
		userInfo0. userName = "안효진";
		
		System.out.println(userInfo0.showUserInfo());
		
		
		
		UserInfo userInfo = new UserInfo("himedia", "0308","Admirl Lee");
		System.out.println(userInfo.showUserInfo());
		
		System.out.println();
		
	}
	


}
