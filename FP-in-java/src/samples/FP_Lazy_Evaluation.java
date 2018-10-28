package samples;

import java.util.Objects;

public class FP_Lazy_Evaluation {

	public static void main(String[] args) {

		String inp1 = "hello";
		String inp2 = "world";

		compute(inp1, inp2);

	}

	public static String buildExceptionMessage(String s) {
		// long running...
		System.out.println("building message for " + s);
		return "oooooooops - " + s;
	}

	// Eager Evaluation  on buildExceptionMessage()
//	public static void compute(String s1, String s2) {
//		Objects.requireNonNull(s1, buildExceptionMessage(s1));
//		Objects.requireNonNull(s2, buildExceptionMessage(s2));
//		System.out.println(s1.hashCode() ^ s2.hashCode());
//	}

	// Lazy Evaluation on buildExceptionMessage()
	public static void compute(String s1, String s2) {
		Objects.requireNonNull(s1, () -> buildExceptionMessage(s1));
		Objects.requireNonNull(s2, () -> buildExceptionMessage(s2));
		System.out.println(s1.hashCode() ^ s2.hashCode());
	}

}
