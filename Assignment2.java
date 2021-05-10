/**
 *In the Assignment1 remove the try{}catch(){} block surrounding the sleep method and 
 *try to execute the code. What is your observation?  
 */
package com.hcl;

/**
 * @author Pragati Sharma
 *
 */
import java.util.Date;

class ThreadTimeSleep extends Thread {
	private String threadName;

	ThreadTimeSleep(String name) {
		threadName = name;
		System.out.println("Creating " + threadName);
	}

	// printing current Date and Time
	static void printDateTime() {
		Date date = new Date();
		String string = String.format("Current Date/Time : %tc", date);
		System.out.println(string);
	}

	public void run() {
		System.out.println("Running " + threadName);

		for (int i = 0; i < 2; i++) {
			printDateTime();
			Thread.sleep(10000);
			// Unhandled exception type InterruptedException
			// Surround with try and catch block
		}
	}
}

public class Assignment2 {
	public static void main(String args[]) {
		ThreadTimeSleep threadtimesleep = new ThreadTimeSleep("MyThread");
		threadtimesleep.start();
	}
}
