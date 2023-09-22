package kr.co.himedia.userdefinetype02;

public class MeberTest {
	public static void main(String[] args) {
		//한 명의 헬스클럽 회원 데이터를 저장하고 출력하시오.
		
		Member meber = new Member();
		meber.Name = "이순신";
		meber.age = 30;
		meber.tel = "010-1234-5678";
		meber.email = "admiral@gmail.com";
		meber.address = "서울";
		meber.weight = 80.6f;
		
		System.out.println(meber.Name+"\t"+meber.age+"\t"+meber.tel+"\t"+meber.email+"\t"+meber.address+"\t"+meber.weight);
		
				
				
		
		 
		
	}

}
