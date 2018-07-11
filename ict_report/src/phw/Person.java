package phw;

public class Person {
	public String name;
	public int age;
	
	Person(String name, int age){	// 생성자
		this.name = name;
		this.age = age;
	}
	public String toString() {		// 오버라이딩
		return "이름은 "+name+", 나이는 "+age;
	}
}
