package phw;

import java.util.Scanner;

public class Exec {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름과 나이를 입력하세요");
		String name = scan.nextLine();
		int age = scan.nextInt();
		Person p = new Person(name, age);
		System.out.println(p.toString());
	}
}
