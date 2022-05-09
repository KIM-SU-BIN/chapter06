package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread thread = new DigitThread(); 
		Thread thread2 = new DigitThread(); 
		Thread thread3 = new DigitThread(); 
		
		
		thread.start();
		thread2.start();
		thread3.start();
	}
	}
