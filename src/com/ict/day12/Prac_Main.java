package com.ict.day12;

 class Prac_Main {
	 int a;
	public static void main(String[] args) {
		Prac_Main pm = new Prac_Main();
		pm.play();
	}
	public Prac_Main() {
		this(10);
		this.a = 12;
		System.out.println("기본생성자");
		System.out.println(a);
	}
	public Prac_Main(int a) {
		this.a = a;
		System.out.println("int a 받은 생성자");
	}
	public void play() {
		System.out.println("야옹");
		sound(a);
		System.out.println("멍멍");
	}
	public void sound(int b) {
		System.out.println("컹컹");
	}
}
