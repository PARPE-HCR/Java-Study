package peopleApp;

public class Student extends Person {
	public int studentNo;
	public Student(String name,int age,int studentNo) {
		super(name,age);
		this.studentNo = studentNo;
	}
	@Override
	public void speak() {
		super.speak();//개중요함
		System.out.println("그리고 학번은 " + studentNo + "입니다");
	}
	public void study() {
		System.out.println("자바를 열심히 공부합니다");
	}
	
}
