package generics;

import java.util.ArrayList;
import java.util.List;

public class TypeCastingNotRequiredInGenerics {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add("hi");
		String s = (String) list.get(0); //typecasting
		System.out.println(s);
		
		List<String> l = new ArrayList<String>();
		l.add("hello");
		String st = l.get(0);  //no need to typecasting when you use generic
		System.out.println(st);

	}

}
