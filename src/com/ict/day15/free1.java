package com.ict.day15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;

public class free1 {
	public static void main(String[] args) {
		Stack<String> s1 = new Stack<String>();
		s1.add("둘리");
		s1.push("공실이");
		s1.add("길동이");
		System.out.println(s1);
		s1.add(0,"도우너");
		System.out.println(s1);
		LinkedList<String> linkedList = new LinkedList<String>();
		Iterator<String> it = linkedList.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			
		}
	}
}
