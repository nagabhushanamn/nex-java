package com;

import java.util.Comparator;

public class Ex3 {

	public static void main(String[] args) {

		Comparator<String> comparator = (s1, s2) -> s1.compareTo(s2);
		Comparator<String> reversedComparator = comparator.reversed();

		String s1 = "hello";
		String s2 = null;

		Comparator<String> comparator2 = Comparator.nullsLast(comparator);
		int diff = comparator2.compare(s1, s2);
		System.out.println(diff);
	}

}
