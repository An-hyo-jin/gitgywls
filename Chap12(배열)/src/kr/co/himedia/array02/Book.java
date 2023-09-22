package kr.co.himedia.array02;

public class Book {
	// 생성자 초기화
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title =title;
		this.author =author;
	}
		
		public Book() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println(title +","+author);
	}

}
