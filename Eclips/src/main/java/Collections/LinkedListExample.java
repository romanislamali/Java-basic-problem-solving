package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample{

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		ll.add("e");
		ll.add("f");
		ll.add("g");
		ll.add("h");
		
		Iterator<String> itr = ll.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
	}

}
