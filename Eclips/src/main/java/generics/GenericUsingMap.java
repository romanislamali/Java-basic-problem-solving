package generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GenericUsingMap {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Roman");
		map.put(4, "Ali");
		map.put(2, "Islam");
		
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		
		Iterator<Map.Entry<Integer, String>> itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry e = itr.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}
