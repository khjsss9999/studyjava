package com.ict.day15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex02 {
	public static void main(String[] args) {
		// Set 인터페이스를 구현한 클래스 : HashSet, TreeSet
		// 특징 : 중복불가, 특정기준으로 정렬이 안됨
		//		(단, TreeSet은 항상 오름차순을 유지한다.)
		//		주머니 구조라고 생각하자
		// 형식) HashSet<제네릭=객체타입=클래스> 참조변수 = new HashSet<[제네릭]>();
		// 형식)  TreeSet<제네릭=객체타입=클래스> 참조변수 = new TreeSet<[제네릭]>();
		
		// 1. 컬렉션 생성
		// 기본자료형은 안됨
		// HashSet<int> h1 = new HashSet<int>();
		
		HashSet<Integer> h1 = new HashSet<>();     // Integer 객체로 만든게 들어감. int로 나오는건 언박싱?
		HashSet<Double> h2 = new HashSet<Double>();
		TreeSet<String> h3 = new TreeSet<String>();
		TreeSet<Character> h4 = new TreeSet<Character>();
		
		// 2. 컬렉션에 객체 넣기(add(E e))
		Integer k1 = new Integer(10);
		Integer k2 = new Integer("20");
		
		h1.add(k1);
		h1.add(k2);
		h1.add(new Integer(30));
		h1.add(new Integer("40"));
		// int => Integer => 오토박싱 : 기본자료형을 객체로 변경
		h1.add(50);
		// 바로 String 안됨
		// h1.add("60");
		System.out.println(h1.add(10));
		
		System.out.println(h1);
		
		// 일반 for문을 사용할 수 없다.
		// for (int i = 0; i < h1.size(); i++) {
		//	  System.out.println(h1[i]);
		// }
		
		// 개선된 for문 사용가능
		// : 은 처음부터 끝까지 하나씩 이라는 의미  h1는 대상이며 h1를 처음부터 끝까지 하나씩 끄집어냄
		// Integer 는 자료형이고 k는 변수이름
		for (Integer k : h1) {
			System.out.println(k+1000);
		}
		System.out.println();
		// Iterator는 순서대로 접근하는 것.
		// hasNext()는 끄집어낼게 있냐는 것.
		// next()는 다음거 끄집어내서 오라는 뜻.
		// 처음것 앞에서 있다가 hasNext()로 다음것인 처음것이 있는지를 확인하고 있으면 
		// next()로 다음거를 끄집어내서 온다는 의미이기에 처음것을 끄집어내서 온다.
		// next()로 끄집어내고 나면 해당 위치로 이동한다.
		// 다시 hasNext()로 다음것이 있냐고 묻는것은 자리를 한칸 이동했기에 두번째가 있냐는 의미이다.
		// 계속 확인하고 끄집어내다가 마지막것을 확인하고 끄집어내고 나면 더이상은 없기에 while문을 빠져나간다.
		Iterator<Integer> it =  h1.iterator();
		while (it.hasNext()) {
			int s = it.next();
			System.out.println(s+5000);
			
		}
		// HashSet<Double> h2 = new HashSet<Double>();
		h2.add(10.0);
		h2.add(21.5);
		
		// 오류
		// h2.add(10);
		
		double d1 = 3.1;
		double d2 = 10;
		
	}
}




















