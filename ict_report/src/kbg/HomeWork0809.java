package kbg;

public class HomeWork0809 {
	public int indexOf(String a,String b) {
		for(int i= 0;i<a.length();i++) {
			Character c = a.charAt(i);
			if(c.toString().equals(b)) {
				return i;
			}
		}
		return -1;
	}
	public int count(String a,String b) {
		int cnt =0;
		for(int i= 0;i<a.length();i++) {
			Character c = a.charAt(i);
			if(c.toString().equals(b)) {
				cnt++;
			}
		}
		
		return cnt;
	}
	public static String[] split(String a,String b) {
		int cnt =0;
		for(int i= 0;i<a.length();i++) {
			Character c = a.charAt(i);
			if(c.toString().equals(b)) {
				cnt++;
			}
		}
		String f = a.replace(b,"");
		String[] c = new String[cnt+1];
		for(int i =0;i<c.length;i++) {
			int idx = a.indexOf(b);
			if(idx==-1) {
				c[i]=a;
				return c;
			}
			c[i]=a.substring(0, idx);
			a=a.substring(idx+1);
		}
		
		return c;
	}
	public static void main(String[] args) {
		
		String str ="av-bv-cv-dv-ev-adf-adsf-adf";
		String[] a = split(str,"-");
		for(String n:a) {
			System.out.println(n);
		}
		
//		int[] exArr =  new int[10];
//
//		for(int i = 0; i < exArr.length; i++) {
//			exArr[i] = (exArr.length) - i;
//		}
//		System.out.println(Arrays.toString(exArr));
	}
}
