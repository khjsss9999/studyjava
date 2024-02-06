package com.ict.day17;

public class Ex04_Main {
	public static void main(String[] args) {
		Ex04 test1 = new Ex04();
		new Thread(test1, "첫번째 스레드").start();
		new Thread(test1, "두번째 스레드").start();
		
	}
}
