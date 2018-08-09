package kks;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static String str = "";

	public static String[] split(String str2) {
		int num = 0;
		String strr = str;

		for (int i = 0; i < strr.length(); i++) {
			Character c = strr.charAt(i);
			if (c.toString().equals(str2)) {
				num++;
			}
		}
		num++;
		String[] strArr = new String[num];

		for (int i = 0; i < num; i++) {
			int idx = strr.indexOf(",");
			if (idx == -1) {
				strArr[i] = strr;
				break;
			}
			strArr[i] = strr.substring(0, idx);
			strr = strr.substring(idx + 1);
		}

		return strArr;
	}

	public static void main(String[] args) {
		str = "A,B,C,D";
		String[] arr = Test.split(",");
		for (String s : arr) {
			System.out.println(s);
		}
	}
}