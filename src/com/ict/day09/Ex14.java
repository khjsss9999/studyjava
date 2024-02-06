package com.ict.day09;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Ex12 t1 = new Ex12();
		t1.play02("일지매", 80, 85, 85);
	System.out.println("-----------------");
		Ex13 t2 = new Ex13();
		t2.play02("임꺽정", 100, 95, 95);
		System.out.println("----------------");
		Scanner scan = new Scanner(System.in);
		String str = "";
		int k1 = 0;
		int k2 = 0;
		int k3 = 0;
		System.out.print("이름 : ");
		str = scan.next();
		System.out.print("국어점수 : ");
		k1 = scan.nextInt();
		System.out.print("영어점수 : ");
		k2 = scan.nextInt();
		System.out.print("수학점수 : ");
		k3 = scan.nextInt();
		t1.play02(str, k1, k2, k3);
		System.out.println("--------------");
		t2.play02(str, k1, k2, k3);
		System.out.println("--------------");
		
	}

}
