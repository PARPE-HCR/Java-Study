package 개인연습;

import java.util.Scanner;

public class 클래스연습_성적관리 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 학생이름:");
		String Name = scanner.nextLine();
		System.out.print("국어 점수:");
		int kor = scanner.nextInt();
		System.out.print("영어 점수:");
		int eng = scanner.nextInt();
		System.out.print("수학 점수:");
		int math = scanner.nextInt();
		Student s1 = new Student(Name,kor,eng,math);
	    
		scanner.nextLine();
		
		System.out.print("두번째 학생이름:");
		String Name2 = scanner.nextLine();
		System.out.print("국어 점수:");
		int kor2 = scanner.nextInt();
		System.out.print("영어 점수:");
		int eng2 = scanner.nextInt();
		System.out.print("수학 점수:");
		int math2 = scanner.nextInt();
		Student s2 = new Student(Name2);
		s2.setScores(kor2, eng2, math2);
		s1.show();
		s2.show();
	}
}
class Student{
	String Name;
	int kor;
	int eng;
	int math;
	public Student(String Name,int kor,int eng,int math) {
		this.Name = Name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public Student(String Name2) {
		this.Name = Name2;
	}
	public void setScores(int kor,int eng,int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	public int get_Total() {
		int total = (kor + eng + math);
		return total;
	}
	public double get_Average() {
		double average = get_Total()/3.0;
		return average;
	}
	public void show() {
		System.out.println("학생성적");
		System.out.println("이름:" + Name);
		System.out.println("국어:" + kor);
		System.out.println("수학:" + math);
		System.out.println("영어:" + eng);
		System.out.println("총점:" + get_Total());
		System.out.println("평균:" + get_Average());
	}	
}
