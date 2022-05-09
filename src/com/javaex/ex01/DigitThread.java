package com.javaex.ex01;

//Thread 필드 생성자 메소드 (출장기능 - 기능하기 - 종료)

public class DigitThread extends Thread {//출장가서 상속받기
	
	
	//필드
	
	//생성자
	
	//메소드 - gs
	
	//메소드 - 일반
	
	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println(i);
			try {		//속도늦추기
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	

}
