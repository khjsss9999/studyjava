package com.ict.day02;

public class Ex02 {
	public static void main(String[] args) {
	  // 문자형 : char  , 숫자로 저장된다. (연산이 가능하다)
	  //       그러나 우리는 숫자 대신에 홑따옴표를 사용 ('a', 'A','가'...)
	  // 		정수는  char ch1 = 1000; 이런 식으로 쓰면 된다. 
	  // 		char ch1 = '0'    이나 '1' 이런식으로 쓰면 
	  //        0이나 1이라는 숫자가 아니라 해당 문자에 대한 정수가 저장된다.
	  // 선언
	  // char 변수이름 ; (선언)
	  // 변수이름 = 데이터( 'a', 'A','가'...)
		
	  // 문자형 ch1 이라는 변수에 a를 저장하자
		char ch1 ;
		ch1 = 'a' ;
		
	  // ch1를 화면에 출력하자 
		System.out.println(ch1);
		
		ch1 = 'A';
		System.out.println(ch1);
		
		ch1 = 100;
		System.out.println(ch1);
		
		ch1 = 100 - 32 ;
		System.out.println(ch1);
		// 변수에 저장하지 않았으므로 문자가 아니라 숫자 100이 나온다.
		System.out.println(ch1+32); 
		char a =  0;
		char b = 0;
		System.out.println(a);
		System.out.println(b);
	}
}
