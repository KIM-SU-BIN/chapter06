package com.javaex.ex03;

public class Ex01 {

	public static void main(String[] args) throws InterruptedException {
		
		/*Runnable digit = new DigitImpl();
		Thread thread = new Thread(digit);
		밑에처럼 사용해도 됨! */
		Thread thread = new Thread(new DigitImpl());
		thread.start();
		
		
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch);
			Thread.sleep(1000);
		}
		
	}

}
