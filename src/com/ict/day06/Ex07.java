package com.ict.day06;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 전체횟수, 짝수횟수, 퍼센트(소수점 첫째자리까지)
		int count = 0; // 전체 횟수
		int even = 0; // 짝수 횟수
	esc:while (true) {
			count++;
			System.out.print("숫자 입력 : ");
			int su = scan.nextInt();
			String result = "";
			if (su%2 == 0) {
				even++;
				result = "짝수";
			}else {
				result = "홀수";
			}
			System.out.println(su+"는 "+result+"입니다.");
			
			while (true) {
				System.out.println("계속할까요? 1.yes, 2.no) >> ");
				int res = scan.nextInt();
				if(res == 1) continue esc;
				if(res == 2) break esc;
				
				System.out.println("제대로 입력하세요");
			} // 안 while
		} // 밖 while
		System.out.println("수고 하셨습니다.");
		double per = (even/(count*1.0))*100;
		
		System.out.println("전체 횟수 : "+count);
		System.out.println("짝수 횟수 : "+even);
		System.out.println("반올림한 퍼센트 : "+(int)(per*100)/100.0+"퍼 입니다.");
		System.out.println("퍼센트를 모두 표시하면 : "+per+"퍼 입니다.");
	}
}














