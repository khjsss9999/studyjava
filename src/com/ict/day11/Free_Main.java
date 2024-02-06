package com.ict.day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Free_Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("학생 수를 입력하세요 : ");
				String su = scan.next();
				

			} catch (InputMismatchException e) {
				System.out.println("제대로 입력하세요.");
				
			}

		}
		//System.out.println("벗어났음");
	}

}
