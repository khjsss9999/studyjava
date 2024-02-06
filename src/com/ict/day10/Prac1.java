package com.ict.day10;

import java.util.Scanner;

public class Prac1 {

	private String name = "";
	private int price = 0;
	private int count = 0;
	private int nameInt = 0;
	// namePrice배열은 해당 name의 가격
	// 0.아메리카노, 1.카페라떼, 2.바나나주스, 3.키위주스
	private int[] namePrice = { 1500, 2000, 2300, 2500 };

	public Prac1() {
		// TODO Auto-generated constructor stub
		System.out.println("메뉴 이름과 해당 메뉴의 개수를 생성자의 인자에 입력하세요.");
	}

	public Prac1(String name, int count) {
		System.out.println("메뉴 이름과 해당 메뉴의 개수를 받는 생성자");
		this.name = name;
		this.count = count;
		re: while (true) {
			switch (name) {
			case "아메리카노":
				this.nameInt = 0;
				this.price = this.namePrice[0];
				break re;
			case "카페라떼":
				this.nameInt = 1;
				this.price = this.namePrice[1];
				break re;
			case "바나나주스":
				this.nameInt = 2;
				this.price = this.namePrice[2];
				break re;
			case "키위주스":
				this.nameInt = 3;
				this.price = this.namePrice[3];
				break re;

			default:
				reSel: while (true) {
					System.out.println("잘못 선택 하셨습니다. " + "\n 다시 선택하시겠습니까? yes.(y/Y), no.(n/N)");
					Scanner scan = new Scanner(System.in);
					String sel = scan.next();
					if (sel.equalsIgnoreCase("y")) {
						continue re;
					} else if (sel.equalsIgnoreCase("n")) {
						break re;
					} else {
						continue reSel;
					}
				}
			}
		}
		
	}

	public int getResult() {
		return this.price;
	}
	
	
}
