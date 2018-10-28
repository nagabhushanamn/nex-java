package com;

/**
 * 
 * 
 * Interface vs AbstractClass
 * 
 * 
 */

import java.util.function.Predicate;

//---------------------------------------------------
interface Collection {
	void add(String ele);

	void clear();
}

interface List extends Collection {
	void add(int idx, String ele);

	default boolean removeIf(Predicate predicate) {
		return false;
	}
}

interface Set extends Collection {
}

//---------------------------------------------------

abstract class AbstractList implements List {
	@Override
	public void clear() {

	}
}

//---------------------------------------------------

class ArrayList extends AbstractList implements List {

	@Override
	public void add(String ele) {

	}

	@Override
	public void add(int idx, String ele) {

	}

}

class LinkedList extends AbstractList implements List {

	@Override
	public void add(String ele) {

	}

	@Override
	public void add(int idx, String ele) {

	}

}

//---------------------------------------------------

public class Ex2 {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.removeIf(item -> true);

	}

}
