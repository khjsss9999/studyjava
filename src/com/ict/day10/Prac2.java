package com.ict.day10;

import java.util.Scanner;

public class Prac2 {
	public static void main(String[] args) {
		int input = 0;
		int output = 0;
		String name = "";
		int price = 0;
		int total = 0;
		int count = 0;
		// namePrice배열은 해당 name의 가격
		//0.아메리카노, 1.카페라떼, 2.바나나주스, 3.키위주스
		
		Scanner scan = new Scanner(System.in);
		// 메뉴는 name 변수를 뜻하며 원하는 메뉴 이름을 문자열로 쓰면 됨
		System.out.print("금액을 투입하세요 : ");
		input = scan.nextInt();
		System.out.println("아메리카노 1500, 카페라떼 2000, 바나나주스 2300, 키위주스 2500");
		System.out.print("메뉴를 선택하세요 : ");
		name = scan.next();
		System.out.println("해당 메뉴의 개수를 선택하세요 : ");
		count = scan.nextInt();
		Prac1 prac1 = new Prac1(name,count);
		price = prac1.getResult();
		total = price*count;
		System.out.println("메뉴 : "+name+" 가격 : "+price +"원을 "+count+"개 선택하셨습니다.");
		output = input - total;
		System.out.println("총 가격 : "+total+"원 이며 거스름돈 : "+output+"원 입니다.");
		System.out.println("맛있게 드세요.");
	}
}
