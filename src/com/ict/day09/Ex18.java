package com.ict.day09;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k1 = 0;
		int k2 = 0;
		
		
	    // 첫번째 숫자 :
		System.out.print("첫번째 숫자 : ");
		k1 = scan.nextInt();
		// 두번째 숫자 :
		System.out.print("두번째 숫자 : ");
		k2 = scan.nextInt();
				
		// 연산자 : +, -, *, /
		Ex17 t = new Ex17();
		String str = scan.next();
		
		switch(str) {
		case "+": t.plus(k1, k2); 
		System.out.println(k1+str+k2+"="+t.res);
		break;
		case "-": t.sub(k1, k2);
		System.out.println(k1+str+k2+"="+t.res);
		break;
		case "*": 
			int k = t.mul(k1, k2);
			System.out.println(k1 + str+k2+"="+k);
			break;
		case "/": 
			double s = t.div(k1, k2);
			System.out.println(k1+str+k2+"="+s);
			break;
		}
	 //   t.plus(su1, su2);
	//	plus = t.res;
	//	t.sub(su1,su2);
	//	sub = t.res;
	//	mul = t.mul(su1, su2);
	//	div = t.div(su1, su2);
		
		// 출력
		//  숫자 연산자 숫자 = 결과 (나누기는 소수점 첫째자리까지 반올림해서)
	//	System.out.println(su1+" + "+su2+" = "+plus);
	//	System.out.println(su1+" - "+su2+" = "+sub);
	//	System.out.println(su1+" * "+su2+" = "+mul);
	//	System.out.println(su1+" / "+su2+" = "+div);
		
	}
}






















