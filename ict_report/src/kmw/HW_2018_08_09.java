package kmw;

import java.util.ArrayList;
import java.util.List;

public class HW_2018_08_09 {

	public static void main(String[] args) {
		String str = "aa-bb-cc-dd-ee-ff";
		String f = "-";
		List<String> li = new ArrayList<String>();

		int dx = -1;
		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);

			if (String.valueOf(a).equals(f)) {
				String d = str.substring(dx + 1, i);
				dx = i;
				li.add(d);
			}
			
			if (i == str.length() - 1) {
				String d = str.substring(dx + 1, str.length());
				li.add(d);
			}
		}

		System.out.println(li);
	}

}
