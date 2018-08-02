package jms;

import java.util.ArrayList;
import java.util.HashMap;

public interface UserDAO {

	public ArrayList<HashMap<String,String>> selectUserList();
	
}
