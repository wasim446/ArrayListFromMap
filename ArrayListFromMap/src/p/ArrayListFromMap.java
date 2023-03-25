package p;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListFromMap {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		HashMap<String, ArrayList<String>> map = new HashMap<>();
		arrayList.add("1");
		arrayList.add("2");
		map.put("key", arrayList);
		
		ArrayList<String> abc = map.get("key");
		
		System.out.println(abc);
		

	}

}
