package kr.co.himedia.interface02;

public class CompleteCalculatorTest {
	
	public static void main(String[] args) {
		
		Calc calc = new CompleteCalculator();
		
		int num1 = 10, nmu2 =2;
		System.out.println(num1+"+"+ nmu2+"="+calc.add(num1, nmu2));
		System.out.println(num1+"-"+ nmu2+"="+calc.substract(num1, nmu2));
		System.out.println(num1+"*"+ nmu2+"="+calc.times(num1, nmu2));
		System.out.println(num1+"/"+ nmu2+"="+calc.divide(num1, nmu2));
	}

}
