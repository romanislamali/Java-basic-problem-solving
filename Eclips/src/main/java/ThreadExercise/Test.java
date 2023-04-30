package ThreadExercise;

public class Test {

	public static void main(String[] args) {
		ThreadDemo td = new ThreadDemo();
//		td.run();
		td.start();
		
		ThreadDemo1 td1 = new ThreadDemo1();
//		td1.run();
		td1.start();
	}

}
