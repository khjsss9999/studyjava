package com.ict.day04;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		int dan = 0;
		int su = 0;
		int total = 0; 
		int vat = 0;
		int input = 0;
		int output = 0;
		String drink = "";
		
		System.out.println(">>>>>>>>>> 메뉴 >>>>>>>>>>>");
		System.out.println(">>>   1.카페모카(3500)   >>>");
		System.out.println(">>>   2.카페라떼(4000)   >>>");
		System.out.println(">>>   3.아메리카노(3000)  >>>");
		System.out.println(">>>   4.과일쥬스(4000)   >>>");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.print("메뉴를 선택하세요 >>>");
		menu = scan.nextInt();
		System.out.println();
		System.out.print("몇 잔을 하시겠습니까?");
		su = scan.nextInt();
		System.out.println();
		if(menu == 1) {
			drink = "카페모카";
			dan = 3500;
		}else if (menu == 2) {
			drink = "카페라떼";
			dan = 4000;
		}else if (menu == 3) {
			drink = "아메리카노";
			dan = 3000;
		}else if (menu == 4) {
			drink = "과일쥬스";
			dan = 4000;
		}
		vat = (int)(dan*su*0.1);
		total = dan*su+ vat;
		System.out.println("선택하신 메뉴는 "+drink+"입니다.");
		System.out.println("선택하신 수량은 "+su+"잔 입니다.");
		
		System.out.print("투입할 금액>>>");
		input = scan.nextInt();
		System.out.println();
		System.out.println("투입하신 금액은 "+input+"원 입니다.");
		
		output = input - total;
		System.out.print("잔돈은 >>>> "+output+"원 입니다.");
		
	}
}
