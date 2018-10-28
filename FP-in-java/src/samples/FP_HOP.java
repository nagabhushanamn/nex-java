package samples;

import java.util.function.Predicate;

public class FP_HOP {

	public static Predicate<Integer> and(Predicate<Integer> min, Predicate<Integer> max) {
		// -----------------------------------------------------
		// c.- The return value of a function can be a function
		// -----------------------------------------------------
		Predicate<Integer> predicate = n -> min.test(n) && max.test(n);
		return predicate;
	}

	public static void main(String[] args) {

		// -----------------------------------------------------
		// a. - A function can be stored in a variable or value
		// -----------------------------------------------------

		Predicate<Integer> predicate1 = n -> n > 10;
		Predicate<Integer> predicate2 = n -> n < 100;

		// -----------------------------------------------------
		// b.- A parameter of a function can be a function
		// -----------------------------------------------------

		Predicate<Integer> predicate = and(predicate1, predicate2);
		boolean b = predicate.test(50);
		System.out.println(b);

		
		//------------------------------------------------------
		
		Predicate<Integer> pre=predicate1.or(predicate2);
		
		
		//----------------------------------------------------
	}

}
