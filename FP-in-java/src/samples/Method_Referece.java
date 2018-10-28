package samples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

class Util {
	public static boolean isNonVeg(String item) {
		return item.equals("non-veg");
	}
}

class Employee {

	private String name;
	private int age;

	public Employee() {
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}

public class Method_Referece {

	public static void main(String[] args) {

		List<String> menu = new ArrayList<>();
		menu.add("veg");
		menu.add("non-veg");
		menu.add("veg");
		menu.add("non-veg");
		menu.add("veg");
		menu.add("non-veg");

		// ----------------------------------
		// menu.removeIf(m -> m.equals("non-veg"));
		// menu.removeIf(item -> Util.isNonVeg(item));
		// or
		menu.removeIf(Util::isNonVeg); // Method Reference
		// ----------------------------------

		System.out.println(menu);

		// -----------------------------------
		// static-method reference
		// --------------------------------------
		Supplier<Thread> supplier1 = () -> Thread.currentThread();
		//
		Supplier<Thread> supplier2 = Thread::currentThread;

		IntBinaryOperator intBinaryOperator1 = (x, y) -> Integer.compare(x, y);
		// or
		IntBinaryOperator intBinaryOperator2 = Integer::compare;

		// -----------------------------------
		// instance-method reference
		// --------------------------------------

		// a. specified instance
		String str = "nexwave";

		IntSupplier intSupplier1 = () -> str.length();
		// or
		IntSupplier intSupplier2 = str::length;

		BiFunction<Integer, Integer, String> biFunction1 = (b, e) -> str.substring(b, e);
		BiFunction<Integer, Integer, String> biFunction2 = str::substring;

		// b. un-specified instance
		BiFunction<String, Integer, String> biFunction11 = (s, idx) -> s.substring(idx);
		BiFunction<String, Integer, String> biFunction12 = String::substring;

		String r = biFunction12.apply("nexwave", 2);

		// -----------------------------------
		// constructor reference
		// --------------------------------------

		Supplier<Employee> empSupplier1 = () -> new Employee();
		Supplier<Employee> empSupplier2 = Employee::new;

		Function<String, Employee> function1 = name -> new Employee(name);
		Function<String, Employee> function2 = Employee::new;

		BiFunction<String, Integer, Employee> function3 = Employee::new;

		// --------------------------------------

	}

}
