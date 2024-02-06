package com.ict.day16;

// 스레드 만들어서 처리 하려면 
public class Ex08_TestA extends Thread{
	// start 와 run이 같이 있으면 start를 찾아가기에 run
	// 이 실행이 안 돼서 스레드가 실행되지 않으며 main이 다한다.
//	@Override
//	public void start() {
//		for (int i = 0; i < 100; i++) {
//			System.out.println("aaa : "+i+Thread.currentThread().getName());
//		}
//	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("aaa : "+i+Thread.currentThread().getName());
		}
	}
}
