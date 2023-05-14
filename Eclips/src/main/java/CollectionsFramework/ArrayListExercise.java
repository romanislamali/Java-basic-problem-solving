package CollectionsFramework;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListExercise {

	public static void main(String[] args) {

		ArrayList<String> collection1 = new ArrayList();
		
		// add elements to collection1
		collection1.add("Dhaka");
		collection1.add("Barishal");
		collection1.add("Khulna");
		collection1.add("Rangpur");
		collection1.add("Shylhet");		
		System.out.println("A list of cities in collection1: "+collection1);
		System.out.println("Size of collection1: "+collection1.size());
		
		// contains/check element of collection1		
		boolean checkElement = collection1.contains("Barishal");
		System.out.println(checkElement);
		boolean checkElements = collection1.containsAll(collection1);
		System.out.println(checkElements);
		
		// remove elements from collection1
		collection1.remove(2);
		System.out.println(collection1);
		System.out.println("Size of collection1 after remove a element: "+collection1.size());
		
		// Create new collection2
		Collection<String> collection2 = new ArrayList<>();
		collection2.add("Rifa");
		collection2.add("Munira");
		collection2.add("Nafi");
		collection2.add("Maroa");
		collection2.add("Nusrat");
		System.out.println("List of name in collection2: "+collection2);
		
		// add two collections and store it c1 collection
		ArrayList<String> c1 = (ArrayList<String>) collection1.clone();
		c1.addAll(collection2);
		System.out.println(c1);
		
		c1 = (ArrayList<String>) collection1.clone();
		c1.retainAll(collection2);
		System.out.println(c1);
		
		c1 = (ArrayList<String>) collection1.clone();
		c1.removeAll(collection2);
		System.out.println(c1);

	}

}
