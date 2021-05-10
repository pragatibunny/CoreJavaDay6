/**
 *Rewrite Assignment3 so that, now the class DemoThread1 instead of 
 *implementing from Runnable interface, will now extend from Thread class.  
 */
package com.hcl;

/**
 * @author Pragati Sharma
 *
 */
class DemoThread extends Thread {
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Running child thread in loop " + i);
				Thread.sleep(2000);

			}
		}

		catch (InterruptedException e) {
			System.out.println("Thread  interrupted.");
		}
	}
}

public class Assignment4 {

	public static void main(String[] args) {
		DemoThread demoThread1 = new DemoThread();
		DemoThread demoThread2 = new DemoThread();
		DemoThread demoThread3 = new DemoThread();
		demoThread1.start();
		demoThread2.start();
		demoThread3.start();
	}

}

