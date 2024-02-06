package com.ict.day10;

public class Ex11 {
	// 변수의 접근제한자가 private 이므로 외부에서 접근할 수 없다.
	// 클래스 내부의 메서드를 이용해서 접근하고 데이터를 변경하거나 보낼 수 있다.
	// getter() : **호출하는 입장에서 데이터를 가져올 수 있다.
	// setter() : **호출하는 입장에서 데이터를 변경하겠다.
	 private String name = "홍길동";     // 이름
	 private int age = 24;			  // 나이
	 private double weight = 72.6;	  // 몸무게
	 private boolean gender = true;    // 성별

	
	 public Ex11() {
		// TODO Auto-generated constructor stub
		 System.out.println("기본 생성자");
	}
	 
	public Ex11(String name) {
		System.out.println("문자열 name을 인자로 받는 생성자");
		this.name = name;
	}
	// 메뉴의 source = get/set
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return this.weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	

}
