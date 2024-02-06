package com.ict.day09;

public class Prac {
	String name = "홍길동";
	private int kor = 80;
	private int eng = 90;
	private int math = 100;
	private int total = 0;
	private int sum = 0;
	
	public void play01() {
		this.total = this.kor + this.eng + this.math;
		System.out.println(total);
	}
	public int play02() {
		 this.sum = this.kor + this.eng + this.math;
		return this.sum;
	}
	public int play03() {
	  this.total = this.kor + this.eng + this.math;
		return this.total;
	}
	public static void main(String[] args) {
		Prac prac = new Prac();
		prac.play01();
		prac.play02();
	}
}
