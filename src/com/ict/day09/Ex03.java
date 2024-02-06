package com.ict.day09;

public class Ex03 {
	public static void main(String[] args) {
		// Math 클래스 주요메서드
		//   : 수학에서 자주 사용하는 상수들과 static 함수들을 미리 구현해 놓은 클래스
		
		// E , PI
		System.out.println(Math.E); // 자연 로그의 밑 값   2.718....
		System.out.println(Math.PI);
		
		// 메서드가 모두 static이다. 
		// 생성자는 없다. => 객체 생성으로 할 수 없다. Math.메서드() 로 접근가능하다.
		
		// 1. random() : 0.0 ~ 1.0 미만의 임의의 난수 발생
		System.out.println(Math.random());
		int k1 = (int)(Math.random()); // 무조건 0;
		int k2 = (int)(Math.random()*10);
		int k3 = (int)(Math.random()*3);
		System.out.println(k1);
		System.out.println(k2);
		System.out.println(k3);
		
		// 2.ceil() : 올림, round() : 반올림, floor() : 버림
		System.out.println("ceil : 음수도 커지는 쪽으로 올림이기에 -10.1231이 -10 보다 작은 수 였기에 -10으로 커진다. ");
		System.out.println(Math.ceil(10.0));     // 10
		System.out.println(Math.ceil(10.1231));  // 11
		System.out.println(Math.ceil(-10.0));    // -10
		System.out.println(Math.ceil(-10.1231)); // -10

		System.out.println("floor : 음수도 작아지는 쪽으로 버림이기에 -10.984가 -11 보다 큰 수 였기에 -11로 작아진다. ");
		System.out.println(Math.floor(10.0));     // 10
		System.out.println(Math.floor(10.984));  // 10
		System.out.println(Math.floor(-10.0));    // -10
		System.out.println(Math.floor(-10.984)); // -11
		
		System.out.println("round : 반올림(소수점 첫째자리기준");
		System.out.println(Math.round(10.0));  // 10
		System.out.println(Math.round(10.4));  // 10
		System.out.println(Math.round(10.5));  // 11
		System.out.println(Math.round(-10.1));  // -10
		System.out.println(Math.round(-10.5));  // -10
		System.out.println(Math.round(-10.51)); // -11
		
		// 3. abs() : 절대값 (양수 -> 양수, 음수 -> 양수)
		System.out.println("abs : 절대값");
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(-10));
		System.out.println(Math.abs(-10.1231));
		
		// max(수1, 수2) : 큰 값 , min(수1, 수2) : 작은값
		System.out.println(Math.max(14,15.001));
		System.out.println(Math.min(15, 15.009));
		
		
	}
}
























