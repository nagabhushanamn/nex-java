package samples;

import java.util.function.Consumer;

public class Lambda_vs_Anonymous_Inner_Class {

	public static void main(String[] args) {

		// A class => instance
		Consumer<String> consumer = new Consumer<String>() {
			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub

			}
		};

		// No class, but it is function-object
		Consumer<String> consumerFunc = s -> System.out.println(s);

	}

}
