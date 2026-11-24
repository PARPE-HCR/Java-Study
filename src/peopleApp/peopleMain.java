package peopleApp;

public class peopleMain {
	
	static void personspeak(Person p) {
		p.speak();
	}

	public static void main(String[] args) {
		Person p1 = new Person("김자바",30);
		Student p2 = new Student("김영희",20,123456);
		StudentWorker p3 = new StudentWorker("배철수",22,234567,200);
		p1.speak();
		p2.speak();
		p2.study();
		p3.speak();
		p3.work();
		System.out.println("------필드 다형성 테스트---------");
		Person pAny = p2;
		pAny.speak();
		pAny = p3;
		pAny.speak();
		System.out.println("------ 메소드 다형성 테스트---------");
		personspeak(p1);
		personspeak(p2);
		personspeak(p3);
	}

}
