package com.ict.day19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ex01_Main {
	public static void main(String[] args) {
		Ex01 p1 = new Ex01("이순신",40,100);
		Ex01 p2 = new Ex01("김유신",20,100);
		Ex01 p3 = new Ex01("홍길동",13,50);
		
		List<Ex01> list1 = new ArrayList<Ex01>();
		list1.add(p1);
		list1.add(p2);
		list1.add(p3);
		
		
		
		// 컬렉션으로 처리하는 문제를 4교시에 풀자
		// 컬렉션으로 처리하기
		System.out.println("=== 고객명단 순서대로 출력 ===");
		for (Ex01 e : list1) {
			System.out.println(e.getName());
		}
		System.out.println();
		
		System.out.println("총 비용은 ~~~ 입니다.");
		int k1 = 0;
		for (Ex01 e : list1) {
			k1 = k1 + e.getPrice();
		}
		System.out.println("총 비용은 ~~~ "+k1+"원 입니다.");
		
		System.out.println();
		
		System.out.println("=== 나이가 20이상인 고객의 명단 출력(입력순) ===");
		List<String> list2 = new ArrayList<String>();
		for (Ex01 e : list1) {
			if(e.getAge()>=20) {
				list2.add(e.getName());
				System.out.println(e.getName()+" 고객님은 나이가 20이상입니다. ");
			}
		}
		
		
		System.out.println("=== 나이가 20이상인 고객의 명단 출력(오름차순) ===");
	 	 list2.sort(null);
	 	 for (String e : list2) {
				System.out.println(e);
		}
		
		System.out.println("============================");
		
		// 스트림으로 처리하기
		System.out.println("=== 고객명단 순서대로 출력 ===");
		Stream<Ex01> stream	=	list1.stream();
		stream.map(i->i.getName()).forEach(i->System.out.println(i+" 고객"));
		
		// 위에서 최종 처리를 했으므로 다시 Stream을 만들어야 사용할 수 있다.
		int sum = list1.stream().mapToInt(i->i.getPrice()).sum();
		System.out.println("총 비용은 "+ sum+ " ~~~ 입니다.");
		
		
		System.out.println("=== 나이가 20이상인 고객의 명단 출력(입력순) ===");
		stream = list1.stream();
		stream.filter(i-> i.getAge()>=20).map(i->i.getName()).forEach(i->System.out.println(i));
		
		System.out.println("=== 나이가 20이상인 고객의 명단 출력(오름차순) ===");
		stream = list1.stream();
		stream.filter(i-> i.getAge()>=20).map(i->i.getName()).sorted().forEach(i->System.out.println(i));
	
		//교재 485페이지 문제를 4교시에 풀자
	
	}
}
























