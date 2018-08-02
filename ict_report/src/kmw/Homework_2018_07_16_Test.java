package kmw;

public class Homework_2018_07_16_Test {
	
	public static void main(String[] args) {

//		for (int i = 1; i < 11; i++) {
//			System.out.println(i);
//		}
//
//		for (int i = 10; i > 0; i--) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}

//		for (int i = 10; i > 0; i--) {
//			if (i % 2 == 1) {
//				System.out.println(i);
//			}
//		}
		
		Integer ig = new Integer(10);
		Long lg = new Long(102);
		
		 
		int i = 10;
		long l=1821;
		
		System.out.println(l);
		System.out.println(ig.longValue());
		System.out.println(lg.intValue());
		
		System.out.println(ig.equals(i));
		
		System.out.println(lg.shortValue());
		
		
		System.out.println(Integer.getInteger("뭐여이건"));
		
		System.out.println(Integer.parseInt("9281"));
		
		System.out.println(Integer.parseInt("7fffffff",16));
		//10진수로 바꿔주는데 "요 안에"있는 숫자의 진법을 , 우측에 적어주면댐 
		//출력할 값이 int 최대치를 넘어서면 터짐
		System.out.println("");

		System.out.println(Integer.toBinaryString(2147483647));
		
		System.out.println(Integer.toString(111) + 22);
		
		System.out.println(Integer.toString(2147483647, 2));
		// 왼쪽에 숫자를 우측의 진법으로 바꿔줌
		
	}

}
