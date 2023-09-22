package kr.co.himedia.array02;

public class ObjectCopy {
	
	public static void main(String[] args) {
		
		Book[] libary = new Book[5];
		Book[] copylib =new Book[5];
		
		libary[0] =new Book("플러터 앱 개발","이정주" );
		libary[1] =new Book("플러터 앱 개발2","이정주2" );
		libary[2] =new Book("플러터 앱 개발3","이정주3" );
		libary[3] =new Book("플러터 앱 개발4","이정주4" );
		libary[4] =new Book("플러터 앱 개발5","이정주5" );
		
		System.arraycopy(libary, 0, copylib, 0, 5);
		
		for(Book book:libary) {
			book.showInfo();
		}
		
		System.out.println();
		
		for(Book book:copylib) {
			book.showInfo();
		}
		
		libary[0].setTitle("안드로이드 앱 개발");
		libary[0].setAuthor("하이미디어");
		
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
