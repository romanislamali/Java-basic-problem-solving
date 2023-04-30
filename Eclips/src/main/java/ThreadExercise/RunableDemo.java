package ThreadExercise;

import static java.lang.Thread.sleep;
public class RunableDemo implements Runnable{

	public void run() {
		for(int i = 1; i < 10; i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("This is Demo *");			
		}
		
	}

}


class RunableDemo1 implements Runnable{

	public void run() {
		for(int i = 1; i < 10; i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			System.out.println("This is Demo #");
		}
		
	}

}
