package samples;

@FunctionalInterface
interface Greet {
	String apply(String name);
}


/*
 
       Lambda syntax: parameters  -> body     
		
		parameters  
		
		    (int a,int b)
		    (a,b)
		    (a)
		    ()
		    a
		
		body 
		
		    {block}
		    expression
		    

*/

public class Function_Syntax {

	public static void main(String[] args) {

//		Greet greetFunc = (String name) -> {
//			String str = "hello " + name;
//			return str;
//		};

		// or
//		Greet greetFunc = (name) -> {
//			String str = "hello " + name;
//			return str;
//		};

		// or

//		Greet greetFunc = name -> {
//			String str = "hello " + name;
//			return str;
//		};

		// or

		Greet greetFunc = name -> "hello " + name;

		String greetMessage = greetFunc.apply("Nag"); // like greetFunc("Nag")
		System.out.println(greetMessage);

	}

}
