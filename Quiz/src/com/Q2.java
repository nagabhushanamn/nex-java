package com;

interface Joiner {
	String join(String s1, String s2);
}

interface Adder {
	double add(double n1, double n2);
}

class Lib {

	public static String getString(Joiner joiner) {
		String s1 = "Hello";
		String s2 = "World";
		return joiner.join(s1, s2);
	}

	public static double getNumber(Adder adder) {
		double d1 = 12.0;
		double d2 = 13.0;
		return adder.add(d1, d2);
	}

}

class Lib_v2 {

	public static String get(Joiner joiner) {
		String s1 = "Hello";
		String s2 = "World";
		return joiner.join(s1, s2);
	}

	public static double get(Adder adder) {
		double d1 = 12.0;
		double d2 = 13.0;
		return adder.add(d1, d2);
	}

}

public class Q2 {

	public static void main(String[] args) {

		String str = Lib_v2.get((String x, String y) -> x + y);
		System.out.println(str);

		double d = Lib_v2.get((Adder) (x, y) -> x + y);
		System.out.println(d);

	}

}
