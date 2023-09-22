package kr.co.himedia.opreator;

public class AssignOperatorTest {
	public static void main(String[] args) {
		int a=  1;
		a++;
		++a;
		a = a + 1;
		a += 1;
		System.out.println("a="+a);		//5
		
		int b = 7;
		b--;
		--b;
		b=b-1;
		b-=1;
		System.out.println("b="+b);		//3
	}

}
