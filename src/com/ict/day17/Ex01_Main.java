package com.ict.day17;

public class Ex01_Main {
	public static void main(String[] args) {
		System.out.println("main : " + Thread.currentThread().getName());
		Ex01 test = new Ex01();
		Thread thread = new Thread(test);
		thread.start();
		
		// join() : 현재 스레드는 join()을 호출한 스레드가 끝날때 까지 
		//			대기상태로 빠진다.
		//			join()을 호출한 스레드가 끝나면 다시 실행한다.
		//			즉, 현재 스레드는 join()을 호출한 스레드가 끝나야 실행할 수 있다.
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("수고하셨습니다. : "+ Thread.currentThread().getName());
		
	}
	
}
