package kbg;

import java.util.ArrayList;
import java.util.List;

public class KbgExam20180726 {
//	1. ë¬¸ì?—´ 2ê°œë?? ?…? ¥ë°›ì•„ ? •?ˆ˜ë¡? ë³??™˜?•˜?—¬ ?‘?ˆ˜?˜ ?•©?„ ì¶œë ¥?•˜?Š” ?”„ë¡œê·¸?¨?„ ?‘?„±?•´ì£¼ì„¸?š”.
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("?”?•˜?‹¤ ?ˆ«? aë¥? ?…? ¥?•˜?„¸?š”");
//		int a = Integer.parseInt(scan.nextLine());
//		System.out.println("?”?•˜?‹¤ ?ˆ«? bë¥? ?…? ¥?•˜?„¸?š”");
//		int b = Integer.parseInt(scan.nextLine());
//		System.out.println(a+b);
//	}

//	2. ?‹¤?Œ ë¹ˆì¹¸?— ?“¤?–´ê°? ì½”ë“œë¥? ? ?œ¼?„¸?š”.
//
//	public class Test {
//
//		public static void main(String[] args) {
//			int num = 63;
//			
//			if(   num<100     ) {
//				System.out.println("num?´ 100 ë¯¸ë§Œ?…?‹ˆ?‹¤.");
//			} else if(     num>100     ){
//				System.out.println("num?´ 100 ì´ˆê³¼?…?‹ˆ?‹¤. ");
//			} else {
//				System.out.println("num?´ 100?…?‹ˆ?‹¤.");
//			}
//			
//		}
//	}

//	3. ? •?ˆ˜?˜• ë°°ì—´?„ ë§Œë“¤ê³? 5ê°œì˜ ?œ?¤ê°?(0~ 9)?„ ì§‘ì–´?„£?–´ ì¶œë ¥?•˜?Š” ?”„ë¡œê·¸?¨?„ ?‘?„±?•´ì£¼ì„¸?š”. 
//	  - (List ?‚¬?š©ê°??Š¥)
//	public static void main(String[] args) {
//		List<Integer> a = new ArrayList<Integer>();
//		for(int i =0; i<5;i++) {
//			int b =(int)(Math.random()*10);
//			a.add(b);
//		}
//		for(int n:a) {
//			System.out.println(n);
//		}
//	}

//	4. ? •?ˆ˜?˜• ?°?´?„°???… 2ê°œë?? ?ŒŒ?¼ë¯¸í„°ë¡? ë°›ì•„ ?•©?„ ë¦¬í„´?•˜?Š” ë©”ì†Œ?“œë¥? ?‘?„±?•´ì£¼ì„¸?š”.
//	
//	public int test(int a,int b) {
//		
//		return a+b;
//	}

//
//	5. 1ë¶??„° 50ê¹Œì? ì¤‘ì—?„œ 3?˜ ë°°ìˆ˜?´ê³? 7?˜ë°°ìˆ˜?¸ ?ˆ«?ë¥? ì¶œë ¥?•´ì£¼ì„¸?š”. 
//	public static void main(String[] args) {
//		for(int i = 1;i<50;i++) {
//			if(i%3==0&&i%7==0) {
//				System.out.println(i);
//				
//			}
//		}
//	}
	

//	6. ?ŒŒ?¼ë¯¸í„°ë¡? ?„?˜?˜ ê°’ì´ ?“¤?–´?ˆ?Š” ? •?ˆ˜?˜• ë°°ì—´?„ ë°›ì•„ ìµœë?ê°’ì„ ë¦¬í„´?•´ì£¼ëŠ” ë©”ì†Œ?“œë¥? ?‘?„±?•´ì£¼ì„¸?š”. 
//	  - (?‚¬?´ì¦? 3 ~ 10)      
//	  - (List ?‚¬?š©ê°??Š¥)
//	public int test(int[] a) {
//		int max = 0;
//		for(int i=0;i<a.length;i++) {
//			if(i==0) {
//				max=a[0];
//				
//			}else{
//				if(max<a[i]){
//					max=a[i];
//					
//				}
//				
//			}
//			
//		}
//		return max;
//	}
//
//	7. ?ŒŒ?¼ë¯¸í„°ë¡? String ë°°ì—´ ê³? ë¬¸ì?—´?„ ë°›ì•„ ?•´?‹¹ ë°°ì—´?— ëª‡ë²ˆì§? ë°©ì— ?•´?‹¹ ë¬¸ì?—´?´ ?ˆ?Š”ì§? ë¦¬í„´?•˜?Š” ë©”ì†Œ?“œë¥? ?‘?„±?•´ì£¼ì„¸?š”.
//	  - (List ?‚¬?š©ê°??Š¥)
//	public int test(String[] a,String b) {
//		for(int i = 0;i<a.length;i++) {
//			if(a[i].equals(b)){
//				return i;
//			}
//		}
//		return 0;
//		
//		
//	}
//
//	8. ?‹¤?Œ ?”„ë¡œê·¸?¨?— ?‹¤?–‰ ê²°ê³¼ë¥? ?“°?„¸?š”.
//
//	class Father{
//		
//		public void run() {
//			System.out.println("?•„ë¹ ê? ?‹¬ë¦½ë‹ˆ?‹¤.");
//		}
//	}
//
//	public class Test extends Father{
//
//		@Override
//		public void run() {
//			System.out.println("?‚´ê°? ?‹¬ë¦½ë‹ˆ?‹¤.");
//		}
//
//		public static void main(String[] args) {
//			Father f = new Test();
//			f.run();
//	 
//			Father f2 = new Father();
//			f2.run();
//		}
//
//	} 
//	?‚´ê°? ?‹¬ë¦½ë‹ˆ?‹¤.
//	?•„ë¹ ê? ?‹¬ë¦½ë‹ˆ?‹¤.


//	9. user_info ?¼?Š” ?´ë¦?, ?‚˜?´, ì£¼ì†Œë¥? ???¥?•  ?ˆ˜ ?ˆ?Š” table?„ ë§Œë“œ?Š” ëª…ë ¹?–´ë¥? ?“°?„¸?š” 
//	  - (?´ë¦?, ?‚˜?´?Š” nullê°’ì´ ?•ˆ?˜ê²? ?„¤? •)
//	  - (?°?´?„° ???…, ?‚¬?´ì¦ˆëŠ” ? ?‹¹?ˆ)
//	  - (oracle, mariadb ?‘˜ì¤‘ì— ?•„ë¬´ê±°?‚˜)
//	create table user_info(
//	uiName varchar(200) not null,
//	uiAge int not null,
//	uiAddress varchar(1000) not null);
//
//	10. ë°©ê¸ˆë§Œë“  user_info ?…Œ?´ë¸”ì˜ ?‚´?š©?„ ëª¨ë‘ ë³´ê³  ?‹¶?„?•Œ?— ?‚¬?š©?•˜?Š” ëª…ë ¹?–´ë¥? ?“°?„¸?š”.
//	select * from user_info;
}
