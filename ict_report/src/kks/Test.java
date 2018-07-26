package kks;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static int getEqual(String[] strArr, String str) {
		for (int i = 0; i < strArr.length; i++) {
			if(strArr[i].equals(str)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("배열 생성");
		String arrData = scan.nextLine();
		String[] strArr = arrData.split(",");
		
		System.out.println("찾아낼 문자열");
		String str = scan.nextLine();
		
		int index = getEqual(strArr,str);
		if(index==-1) {
		System.out.println("그런건 없어");
		} else {
			System.out.println(index + "번째에 존재");
		}
	}
}
