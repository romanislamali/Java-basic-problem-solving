package generics;

class TestGenerics<T>{
	T obj;
	void add(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return obj;
	}	
}


public class GenericClassExample{
	public static void main(String[] args) {
		TestGenerics<Integer> m = new TestGenerics<Integer>();
		m.add(2);
//		m.add("Roman"); //Compile time error
		System.out.println(m.get());
	}	
}