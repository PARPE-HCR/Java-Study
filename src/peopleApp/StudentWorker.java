package peopleApp;

public class StudentWorker extends Student {
	public int salary;
	public StudentWorker(String name,int age,int studentNo,int salary) {
		super(name,age,studentNo);
		this.salary = salary;
	}
	@Override
	public void speak() {
		super.speak();
		System.out.println("그리고 월급은 " + salary + "만원 입니다");
	}
	public void work() {
		System.out.println("열심히 알바도 합니다");
	}
}
