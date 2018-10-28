package com;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

class MyList<E> implements Iterable<E> {

	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>() {
			@Override
			public boolean hasNext() {
				return false;
			}

			@Override
			public E next() {
				return null;
			}
		};
	}

}

public class External_Iterantion_Ex {

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1, 2, 3, 5, 7, 4, 8, 9, 10);

		// -------------------------------------------
		// way-1
		// -------------------------------------------
		for (int i = 0; i < integers.size(); i++) {
			int n = integers.get(i);
			System.out.println(n);
		}
		// -------------------------------------------
		// way-2:
		// -------------------------------------------
		Iterator<Integer> iterator = integers.iterator();
		while (iterator.hasNext()) {
			Integer n = (Integer) iterator.next();
			System.out.println(n);
		}

		// -------------------------------------------
		// way-3:
		// -------------------------------------------
		for (Integer i : integers) {
			System.out.println(i);
		}

		// custom collection
		MyList<String> myList = new MyList<>();
		for (String item : myList) {
			// ..
		}

	}

}
