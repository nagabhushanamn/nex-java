package samples;

import java.util.function.Consumer;

class Printer {
	
	static int staVar = 1;
	int insVar = 2;

	public Consumer<String> getPrintConsumer() {

		int v = 12; 

		Consumer<String> consumer = s -> {
			System.out.println("concumed-" + s);
			// System.out.println(staVar);
			// System.out.println(insVar);
			System.out.println(v);
		};

		return consumer;
	}
}

public class FP_Immutable {

	public static void main(String[] args) {

		Printer printer = new Printer();
		Consumer<String> consumer = printer.getPrintConsumer();
		consumer.accept("print-one");

	}

}
