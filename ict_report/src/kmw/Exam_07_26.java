package kmw;

import java.util.ArrayList;

class Father{
	
	public void run() {
		System.out.println("아빠가 달립니다.");
	}
}

public class Exam_07_26 extends Father{

	@Override
	public void run() {
		System.out.println("내가 달립니다.");
	}

	public static void main(String[] args) {
		Father f = new Exam_07_26();
		f.run();
 
		Father f2 = new Father();
		f2.run();
	}
}
