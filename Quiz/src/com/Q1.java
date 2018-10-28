package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q1 {

	public static void main(String[] args) {

		List<String> menu = new ArrayList<>();
		menu.add("veg");
		menu.add("veg");
		menu.add("veg");
		menu.add("non-veg");
		menu.add("veg");
		menu.add("veg");
		menu.add("non-veg");
		menu.add("veg");
		menu.add("non-veg");
		menu.add("non-veg");

		// TODO - create menu with only veg items?

		// -------------------------------------------
		// way-1 : imperative style
		// -------------------------------------------
		
//		Iterator<String> iterator = menu.iterator();
//		while (iterator.hasNext()) {
//			String item = (String) iterator.next();
//			if (item.equals("non-veg"))
//				iterator.remove();
//		}
//		System.out.println(menu);

		// -------------------------------------------

		// -------------------------------------------
		// way-2 : functional style
		// -------------------------------------------
		menu.removeIf(m -> menu.equals("non-veg"));
		System.out.println(menu);

		// -------------------------------------------

	}

}
