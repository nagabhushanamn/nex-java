package samples;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

/*
 
 	in Java, Function-Type is FunctionalInterface
 
 	A wealth of FIs
	
		- A package java.util.function;
		- Over fourty FIs
		- All common types of functions, ready to use
		
		
		Functional Interfaces, by Function Type
		
		
		nothing->T            Supplier
		T->nothing            Consumer
		T->T                  UnaryOperator
		T,T->T                BinaryOperator
		S->T                  Function
		T->boolean            Predicate  
		
		
	
		FI Name       Variants with X=Int,Long,Double         FunctionType
		
		
		Supplier         XSupplier                             noting->X
		Consumer         XConsumer                             X->nothing
		UnaryOperator    XUnaryOperator                        X->X
		BinaryOperator   XBinaryOperator                       X,X->X
		Predicate        XPredicate                            X->boolean


	
		Variants of Function
		
		One primitive type : ToXFunction<T>          ( type:T ->X )
		
			- ToIntFunction<T>, etc.
		
		Two primitive types : XToYFunction<T>        ( type:X ->Y )
		
			-IntToLongFunction,IntToDoubleFunction, and so on
		
		
		No IntToIntFunctiom, why
		
			There's IntUnaryOperator
			
 
 */

public class Function_Types {

	public static void main(String[] args) {

		// Functions

		Consumer<String> consumer = pay -> System.out.println("No Food");
		Supplier<String> supplier = () -> "Biryani";
		Predicate<String> predicate = str -> str.length() > 10;
		Function<String, Integer> function = str -> str.length();
		UnaryOperator<String> unaryOperator = str -> str.toUpperCase();
		BinaryOperator<Integer> binaryOperator = (n1, n2) -> n1 + n2;
		int result = binaryOperator.apply(12, 13);
		System.out.println(result);
		IntBinaryOperator intBinaryOperator = (n1, n2) -> n1 + n2;
		ToIntFunction<String> toIntFunction = str -> str.length();
		IntToDoubleFunction intToDoubleFunction = i -> 100.00;
		IntUnaryOperator intUnaryOperator = i -> i + 2;

	}

}
