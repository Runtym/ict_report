package ljh;

public class Person {
	public String name;
	public int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return " 이름: " + name + " 나이: " + age;
	}
}
