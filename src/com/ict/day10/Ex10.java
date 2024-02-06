package com.ict.day10;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Ex09 coff = new Ex09();
		coff.sName("커피음료");
		coff.sPrice(1500);

		Ex09 ion = new Ex09();
		ion.sName("이온음료");
		ion.sPrice(2300);

		Ex09 cola = new Ex09();
		cola.sName("탄산음료");
		cola.sPrice(2000);

		Ex09 juice = new Ex09();
		juice.sName("과일음료");
		juice.sPrice(1800);

		boolean[] sw = { false, false, false, false };
		Ex09[] arr = { coff, ion, cola, juice };

		Scanner scan = new Scanner(System.in);
		System.out.println("금액을 투입하세요 >> ");
		int input = scan.nextInt();
		int output = 0;

		// 1500을 직접 입력하지 말고 비교해서 찾자
		// 살 수 없는 제품을 선택하면 - 계산이 되는데 살 수 없다고 표시하고 다시 메뉴가 나오도록 해야 한다.
		esc: while (true) {
			System.out.println("남은 돈 : " + input);

			if (input < 1500) {
				System.out.println("금액이 부족합니다.");
				output = input;
				break esc;
			} else {
				System.out.println("커피\t이온\t탄산\t과일\t반환");
				for (int i = 0; i < arr.length; i++) {
					if (arr[i].gPrice() <= input) {
						sw[i] = true;
						System.out.print(" O\t");
					} else {
						sw[i] = false;

						System.out.print(" X\t");

					}
				}
				System.out.println();
			
				System.out.println("선택하세요 >> ");
				String drink = scan.next();
					switch (drink) {
					case "커피":
						if (sw[0] == true) {
							output = input - arr[0].gPrice();
							if(output == 0) {
								System.out.println("투입금을 다 쓰셨습니다.");
								break esc;
							}
							break;
						} else {
							System.out.println("커피는 금액이 부족합니다. 다시 선택하세요.");
							continue esc;

						}
					case "이온":
						if (sw[1] == true) {
							output = input - arr[1].gPrice();
							if(output == 0) {
								System.out.println("투입금을 다 쓰셨습니다.");
								break esc;
							}
							break;
						} else {
							System.out.println("이온은 금액이 부족합니다. 다시 선택하세요.");
							continue esc;
						}
					case "탄산":
						if (sw[2] == true) {
							output = input - arr[2].gPrice();
							if(output == 0) {
								System.out.println("투입금을 다 쓰셨습니다.");
								break esc;
							}
							break;
						} else {
							System.out.println("탄산은 금액이 부족합니다. 다시 선택하세요.");
							continue esc;
						}
					case "과일":
						if (sw[3] == true) {
							output = input - arr[3].gPrice();
							if(output == 0) {
								System.out.println("투입금을 다 쓰셨습니다.");
								break esc;
							}
							break;
						} else {
							System.out.println("과일은 금액이 부족합니다. 다시 선택하세요.");
							continue esc;
						}
					case "반환":
						output = input;
						break esc;
						default : 
							System.out.println("잘못 누르셨습니다. 제대로 눌러주세요.");
							continue esc;
					}
					// 잔돈을 물건을 살수 있는 input으로 전환
					input = output;
		
			}

		}
		System.out.println("잔돈 : " + output);

	}
}
