package khg;

public class ListTest180809 {

	static int cnt = 0; // 카운트를 0으로 초기화

	public static String[] split(String s, String serchStr) {

		String[] a = new String[s.length()];
		///////매개변수두개가 올라오면 문자열의 길이만큼의 배열을 새로만들어서 a 스트링배열에 넣어준다
		String tmp = "";//빈문자열 tmp를 만들어둔다.
		
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			tmp += c.toString();//////tmp에 문자열을 넣어주다가 
			
			if (c.toString().equals(serchStr)) { // '-'이게 나올때
				tmp = tmp.substring(0, tmp.length() - 1);
				a[cnt] = tmp;//////배열 a에 넣어주고
				cnt++; //////카운트를 올려주어 실행부의 출력갯수를 올려주고
				tmp = ""; //////tmp는 원래대로 비워준다.
			}
		}
		a[cnt] = tmp;//////포문이 다돌고 남은 문자열들을 마지막 배열에 넣어주고
		
		return a; /////배열 a를 리턴시켜준다.
	}

	public static void main(String[] args) {
		
		String str = "a-b-c-d-e";
		String[] strs = str.split("-");// 원래스플린트 로직

		String s = "rf34-dfaw-rerfq-dqfw-trerq"; // 위쪽에 만든 스플린트에 사용할 스트링을 초기화한다.

		String[] a = split(s, "-"); //위쪽에 스테이틱스플린트로직에 매개변수 문자열과 스플린트할 문자를를 올려서 리턴받은 값을 스트링베열 a에 넣어준다. 
		
		for (int i = 0; i < cnt + 1; i++) {
			System.out.println(i +"번 방의 값은? = " + a[i]);
		}// 스트링배열 a의 값을 하나씩 찍어준다.



	}
}
