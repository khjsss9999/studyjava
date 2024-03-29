package com.ict.day18;

import java.util.stream.IntStream;

public class Ex06 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,1,2,3,4,5,1,2,3};
		IntStream intStream1 = IntStream.of(arr);
		intStream1.forEach(i->System.out.print(i+" "));
		System.out.println();
		
		// distinct() => 중복제거
		IntStream intStream2 = IntStream.of(arr);
		intStream2.distinct().forEach(i->System.out.print(i+" "));
		System.out.println();
		
		// filter(조건):  조건에 안 맞는 요소 제외
		IntStream intStream3 = IntStream.range(0, 10); // 마지막은 포함 안함
		// 짝수만 출력하자.
		intStream3.filter(i->i%2==0).forEach(i->System.out.print(i+" "));
		System.out.println();
		
		// limit(수) : 수 만큼 자르기 3을 넣으면 3개 까지만 나온다.
		IntStream intStream4 = IntStream.rangeClosed(0, 10); // 마지막 포함
		intStream4.limit(3).forEach(i->System.out.print(i+" "));
		System.out.println();
		// skip(수) : 수만큼 제외시킨다. 3을 넣으면 3개를 제외하고 나머지들이 나온다.
		IntStream intStream5 = IntStream.rangeClosed(0, 10); // 마지막 포함
		intStream5.skip(3).forEach(i->System.out.print(i+" "));
		System.out.println();
		
		
	}
}




















