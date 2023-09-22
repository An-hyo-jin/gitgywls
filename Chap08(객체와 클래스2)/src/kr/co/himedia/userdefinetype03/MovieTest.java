package kr.co.himedia.userdefinetype03;

public class MovieTest {
	// 한편의 영화 데이털르 저장하고 출력하시오. 
	public static void main(String[] args) {
		
		Movie movie = new Movie();
		movie.mtitle = "오펜하이머";
		movie.mday = "2023.08.15";
		movie.mejor = "맷 데이먼 ";
		movie.mpart = "스릴러";
		movie.mtime = 180;
		movie.mlevel = 15;
		
		System.out.println(movie.mtitle+"\t"+movie.mday+"\t"+movie.mejor+"\t"+movie.mpart+"\t"+movie.mtime+"\t"+movie.mlevel);
		
	}

}
