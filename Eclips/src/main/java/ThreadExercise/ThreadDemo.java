package ThreadExercise;

import java.awt.desktop.ScreenSleepEvent;

public class ThreadDemo extends Thread{
	
	
	
	@Override
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

class ThreadDemo1 extends Thread{
	
	
	
	@Override
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
