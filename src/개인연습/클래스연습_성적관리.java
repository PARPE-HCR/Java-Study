package 개인연습;

import java.util.Scanner;

public class 클래스연습_성적관리 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 학생이름:")
		String name = scanner.nextLine();
		System.out.print("국어 점수:");
		int kor = scanner.nextInt();
		System.out.print("영어 점수:")
		int eng = scanner.nextInt();
		System.out.print("수학 점수:")
		int math = scanner.nextInt();
		Student s1 = new Student(name,kor,eng,math);
				
		
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
		
	}
	public static int get_Total() {
		int total = (kor + eng + math);
		return total;
	}
	public static double get_Average() {
		double average = get_Total()/3;
		return average;
	}
	public static void show() {
		System.out.println("학생성적");
		System.out.println("이름:" + name);
		System.out.println("국어:" + kor);
		System.out.println("수학:" + math);
		System.out.println("영어:" + eng);
		System.out.println("총점:" + total);
		System.out.println("평균:" + average);
	}
}
