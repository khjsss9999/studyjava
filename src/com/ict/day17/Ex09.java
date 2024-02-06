package com.ict.day17;


// 추상메서드가 하나일때만 람다식으로 접근제한자 반환형 이름 등등 많은것을 생략
// 가능한데 추상메서드가 2개 이상이면 어느것을 뜻하는지 몰라서 오류를 발생한다.
// 이때 인터페이스 위에 어노테이션 @FunctionalInterface를 붙이면 선언하는
// 부분에서 아예 오류를 띄운다.
@FunctionalInterface
public interface Ex09 {
	int getMax(int num1, int num2);
	// int getMin(int num1, int num2);
}
