package com.ict.day11;

public class Ex15 {
	// static 초기화
	/*
	 
	 	static{
	 	 초기화 내용;
	 	}
	 
	 
	 */
	
	int s1 = 100;
	private int p1 = 300;
	static int s2;
	static int s3;
	
	public static int k2 = 300;
	static int k3 = 300;
	private static int k4 = 5000;
	
	// 블럭 위치 기준으로 위에는 초기화가 되는데 밑에는 다시 값을 넣어서 j2가 400이 됨
	static {
		k2 = 20000;
		s2 = 50000;
		j2 = 40000;
		m2 = 60000;
	}
	// static int m2 는 static 초기화 밑에 있지만 값을 넣지 않고
	// 선언만 한 상태이기 때문에 static 블럭이 위에 있어도 60000으로 초기화 된다.
	static int m2;		// 60000 선언만 됐기에 위에 초기화로 60000 들어감.
	static int j2 = 400; // 400 초기화 됐다가 다시 400 넣음
}
