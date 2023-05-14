package CollectionsFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {

	public static void main(String[] args) {

		Collection<String> collection = new ArrayList<>();
		collection.add("New York");
		collection.add("Atlanta");
		collection.add("Dallas");
		collection.add("Madison");
		System.out.println(collection);
		
		// traverse all the string invoking iterator method
		Iterator<String> iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next().toUpperCase()+" ");
		}
		System.out.println();
		// traverse all the string using foreach loop
		for(String ele : collection) {
			System.out.print(ele.toUpperCase()+" ");
		}
	}

}
