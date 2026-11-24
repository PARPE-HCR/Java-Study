package peopleApp;

public class Person {
	public String name;
	public int age;
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
		
	}
	public void speak() {
		System.out.println("제 이름은 " + name + " 나이는 " + age +"살 입니다"); 
	}
}
