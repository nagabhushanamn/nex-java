package com;

import java.util.stream.IntStream;

public class StremAPI_Primitives {
	
	public static void main(String[] args) {
		
		IntStream intStream=IntStream.range(1, 11);
		int r=intStream.sum();
		System.out.println(r);
		
	}

}
