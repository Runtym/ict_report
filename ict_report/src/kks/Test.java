package kks;

public class Test {
	public static void main(String[] args) {
		int c = 0;
		for(Integer b=256;b>1;c++) {
			b = b/2;
			System.out.println(b);
		}
		System.out.println(c);
	}

}
