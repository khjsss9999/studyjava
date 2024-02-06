package com.ict.day18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Ex05 {
	public static void main(String[] args) {
		// ArrayList를 스트림으로
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();
		stream.forEach(i->System.out.print(i+" "));
		System.out.println();
		
		// 중간처리 : 정렬 => sorted()(오름차순),sorted(Comparator.reverseOrder())(내림차순)
		Stream<String> stream2 = sList.stream();
		stream2.sorted().forEach(i->System.out.print(i+" "));
		System.out.println();

		Stream<String> stream3 = sList.stream();
		stream3.sorted(Comparator.reverseOrder()).forEach(i->System.out.print(i+" "));
		System.out.println();
		
		// 정렬 오름차순 : 아스키코드값에 의해 숫자 -> 대문자 -> 소문자 -> 한글 순으로 나온다.
		Stream<String> stream4 = Stream.of(new String[] {"bb","a","CC","dd","BB","aaa"});
		stream4.sorted().forEach(i->System.out.print(i+" "));
		System.out.println();
		// 정렬 내림차순
		// 아스키코드값에서 큰것 부터 내림차순이다.
		Stream<String> stream5 = Stream.of(new String[] {"bb","a","CC","dd","BB","aaa"});
		stream5.sorted(Comparator.reverseOrder()).forEach(i->System.out.print(i+" "));
		System.out.println();
	
		// 같은 단어에 대소문자만 다를 때는 먼저 생성된것이 먼저 나온다. BB  , bb 일때는 BB- bb  
		Stream<String> stream6 = Stream.of(new String[] {"BB","abc","aabc","1","5","가","라","나","a","BAD","BAA","CC","dd","bb","aaa"});
		stream6.sorted(String.CASE_INSENSITIVE_ORDER).forEach(i->System.out.print(i+" "));
		System.out.println();
		
		Stream<String> stream7 = Stream.of(new String[] {"bb","abc","aabc","1","5","가","라","나","a","BAD","BAA","CC","dd","BB","aaa"});
		stream7.sorted(String.CASE_INSENSITIVE_ORDER.reversed()).forEach(i->System.out.print(i+" "));
		System.out.println();
	
	}
}













