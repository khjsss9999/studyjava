package com.ict.homework;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int[] com = new int[3];
		int[] user = new int[3];
		
		for (int i = 0; i < com.length; i++) {
			com[i] = ran.nextInt(10);
			for (int j = 0; j <= i; j++) {
				if(i == j) {
					continue;
				}else if(com[i] == com[j]) {
					i--;
					break;
				}else {
					continue;
				}
			}
		
		}
		for (int i = 0; i < com.length; i++) {
			System.out.println(com[i]);
		}
		
		
	}
}
