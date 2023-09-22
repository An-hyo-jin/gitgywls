package kr.co.himedia.array02;

public class ObjectCopy2 {
	
	public static void main(String[] args) {
		
		Book[] libary = new Book[5];
		Book[] copylib =new Book[5];
		
		libary[0] =new Book("플러터 앱 개발","이정주" );
		libary[1] =new Book("플러터 앱 개발2","이정주2" );
		libary[2] =new Book("플러터 앱 개발3","이정주3" );
		libary[3] =new Book("플러터 앱 개발4","이정주4" );
		libary[4] =new Book("플러터 앱 개발5","이정주5" );
		
		copylib[0] = new Book();
		copylib[1] = new Book();
		copylib[2] = new Book();
		copylib[3] = new Book();
		copylib[4] = new Book();
		
		for(int i =0; i<libary.length; i++){
		copylib[i].setTitle(libary[i].getTitle());
		copylib[i].setAuthor(libary[i].getAuthor());
		}
		
		libary[0].setTitle("ios 앱 개발자");
		libary[0].setTitle("스티브잡스");
						
		
		System.out.println("==============================");
		
		for(Book book:libary) {
			book.showInfo();
		}
		System.out.println();
		
		for(Book book:copylib) {
			book.showInfo();
		}				
		
		
	}

}
