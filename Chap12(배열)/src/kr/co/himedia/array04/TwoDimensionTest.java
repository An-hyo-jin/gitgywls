package kr.co.himedia.array04;
// 이차원 배열
public class TwoDimensionTest {
	
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		
		int num = 1;
		
		for(int i= 0; i<3; i++) {
			for(int j = 0;j<3; j++) {
				arr[i][j]= num;
				num++;
			}
		}
		for(int i= 0; i<3; i++) {
			for(int j = 0;j<3; j++) {
				System.out.print(arr[i][j]+ "\t");
			}
			System.out.println();
		}
	}

}
