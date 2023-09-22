package kr.co.himedia.arrayList;

import java.util.ArrayList;

public class Student {
	
	private int studentId;
	private String studentName;
	private ArrayList<Subject> subjectList;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
		
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject);		
		
	}
	
	public void showInfo() {
		int total = 0;
		
		for(Subject subject : subjectList) {
			total+= subject.getScorePoint();
			System.out.println("학생 "+this.studentName+"의"+subject.getName()+"과목 성적은"+
		subject.getScorePoint()+"점 입니다.");
			
		}		
		
		System.out.println("학생"+this.studentName+"총점은"+total+"입니다.");
		
		
	

	}

	public void addBook(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
}



















