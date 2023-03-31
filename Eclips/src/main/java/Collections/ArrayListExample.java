package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<String> l = new ArrayList<String>();
		l.add("Roman");
		l.add("Tajnur");
		l.add("Ehsan");
		l.add("Sajib");
			
		Iterator itr = l.iterator();
		
		while (itr.hasNext()) {
			
			System.out.println(itr.next());
		}

	}

}


