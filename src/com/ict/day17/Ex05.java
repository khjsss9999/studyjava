package com.ict.day17;

// 두개의 스레드를 생성하여 첫번째 스레드의 출력을 1~50까지 출력하고,
// 두번째 스레드의 출력은 51~100까지 출력하고,
// 다시 첫번째 스레드가 101~150까지 출력하고,
// 두번째 스레드가 151~200출력 (synchronized 사용)
public class Ex05 implements Runnable {
	int x = 0;

	@Override
	public synchronized void run() {

		for (int i = 1; i < 101; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + ++x);
			if (i% 50 == 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			notify();
		}

	}

}
