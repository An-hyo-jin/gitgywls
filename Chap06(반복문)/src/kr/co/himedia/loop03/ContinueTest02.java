package kr.co.himedia.loop03;

// Quiz) 1~10까지의 수 중 3의 배수의 개수를 구하여 출력하시오. 
public class ContinueTest02 {
	
	public static void main(String[] args) {
		
		int num;
		int sum=0 ;
		for(num=1; num<10; num++) {
			if((num%3)!=0) continue;
		
				sum++;				
		}
		System.out.println(sum);	
			
		
	}

}

