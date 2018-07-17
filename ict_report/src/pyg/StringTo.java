package pyg;

import java.util.Scanner;							 // scanner를 쓰기위해선 반드시 필요하다.

public class StringTo {
	static Scanner scan = new Scanner(System.in);    //값을 입력 받기위해서는 꼭 만들어줘야하는것
	static int num = 0;							     //숫자를 입력받기 위한 그릇
	public static boolean test() {              					 //     4.boolean test() 로 이동되었으니 try를 실행합니다.
		try{								
			System.out.println("숫자를 입력해줘");					//		5. 시스템..을 실행되었으니 두번째줄인 num의 입력값이 들어갔다. 
			num = Integer.parseInt(scan.nextLine());   				//		문자값을 숫자값으로 변환 시키는 실행문을 실행
			return false;							 //		조건에 알맞은 값을(즉, 정수) 입력했을때 false값을 aa에 대입하여 빠져나간다.
		}catch(NumberFormatException b) {			 //					6.오류가 발생한경우 catch에 잡는다. 
			System.out.println("숫자를 제대로 입력해줘");	//			    그러므로 false 라는 조건이 나올때 까지 aa while 문이 실행된
		}
		return true;						
	}
	public static void main(String[] args) {
		System.out.println("숫자 변환 프로그램을 만들어보자");  			// 1.처음 실행되는 곳이다. 
		boolean aa = true;					//            					   2.true 라는 것을 aa 값에 초기화 시켜주었다
		while(aa) {							//aa 값이 나오게 되면 재실행 되도록 프로그램 되어있다. 
			aa = test();													// 3.test() 라는 함수를 aa 로 대입 했으므로 위의 테스트 이동(메소드호출)
		}			
		System.out.println("당신이 입력한 숫자는"+num+"이구나");
		System.out.println("프로그램이 종료");
		
	}
}

