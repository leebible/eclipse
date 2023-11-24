package kr.or.ddit.study13.map;

import java.util.HashMap;
import java.util.Iterator;

public class MapExample03 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		for(int i=0;i<100; i++) {
			map.put("key"+i, "val"+i);
		}
		
		System.out.println(map.get("key0"));
		
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = (String) it.next();
			String val = (String) map.get(key);
			System.out.println(key+"\t"+val);
		}
	}
}
