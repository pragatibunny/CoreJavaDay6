/**
 *Program to create a class DemoThread1 implementing Runnable interface. 
 *In the constructor, create a new thread and start the thread. 
 *In run() display a message "running child Thread in loop :
 * " display the value of the counter ranging from 1 to 10. 
 * Within the loop put the thread to sleep for 2 seconds. 
 *In main create 3 objects of the DemoTread1 and execute the program.  
 */
package com.hcl;

/**
 * @author Pragati Sharma
 *
 */
class DemoThread1 implements Runnable {
	public void run() {
		System.out.println("Running child thread in loop ");
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

public class Assignment3 {

	public static void main(String[] args) {
		DemoThread1 demoThread1 = new DemoThread1();
		DemoThread1 demoThread2 = new DemoThread1();
		DemoThread1 demoThread3 = new DemoThread1();
		Thread thread1 = new Thread(demoThread1);
		Thread thread2 = new Thread(demoThread2);
		Thread thread3 = new Thread(demoThread3);
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
