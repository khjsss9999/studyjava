package com.ict.day09;

public class Ex11 {
	String name = "";
	int sum = 0;
	double avg = 0.0;
	String hak = "";
	public static void main(String[] args) {
		Ex10 t = new Ex10();
		t.play("홍길동", 50, 60, 70);
		Ex11 p = new Ex11();
		p.play01();
	}
	public String play01(){
		name = "홍길동";
		return name;
	}
	public int play02(){
		sum = 100;
		return sum;
	}
}
