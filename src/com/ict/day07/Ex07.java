package com.ict.day07;

public class Ex07 {
	public static void main(String[] args) {
		// 순위 구하기
		// 1. 모든 사람의 순위를 1등으로 초기값 부여
		// 2. 모든 사람과 비교해야 된다. (자기자신 제외)
		// 3. 나(i) 보다 남(j)이 크면 내 순위의 숫자를 증가시킨다.
		int[] su = { 90, 80, 70, 95, 65, 85, 75 };
		int[] rank = { 1, 1, 1, 1, 1, 1, 1 };
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				// 자기자신 제외
				if (i == j)
					continue;
				if (su[i] < su[j]) {
					rank[i] = rank[i] + 1;
				}

			}
		}
		for (int i = 0; i < su.length; i++) {
			System.out.println("su[i] " + su[i] + "= " + rank[i] + " 입니다. ");
		}

	}
}
