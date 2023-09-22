package kr.co.himedia.array03;
// 이차원 배열 연습
public class TwoDimenTest {
	
	public static void main(String[] args) {
		
		int [][] arr = {{1, 2,3}, {4, 5, 6, 7}};		//초기화  안에 행 바깥 열
		
		for(int i = 0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println(", \t"+ arr[i].length);		//행의 개수 출력
			System.out.println();							//초기화 숫자 출력
		}

}
	
}
