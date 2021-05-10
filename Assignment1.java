/**
 * Program to assign the current thread to t1. 
 * Change the name of the thread to MyThread. Display the changed name of the thread. 
 * Also it should display the current time. 
 * Put the thread to sleep for 10 seconds and display the time again. 
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
		try {
			for (int i = 0; i < 2; i++) {
				printDateTime();
				Thread.sleep(10000);
			}
		}

		catch (InterruptedException e) {
			System.out.println("Thread " + threadName + " interrupted.");
		}
	}
}

public class Assignment1 {
	public static void main(String args[]) {
		ThreadTimeSleep threadtimesleep = new ThreadTimeSleep("MyThread");
		threadtimesleep.start();
	}
}
