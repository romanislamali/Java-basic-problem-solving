package Collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("Roman");
		v.add("Tajnur");
		v.add("Ehsan");
		v.add("Sajib");
		v.add("Rashed");
		v.add("Farjana");
		v.add("Istiaque");
		
		Iterator<String> itr = v.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
