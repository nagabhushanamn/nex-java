package com;

import java.util.stream.Stream;

public class StreamAPI_Intro {

	public static void main(String[] args) {

//		---------------------------------------------------
		// a. from collection
//		---------------------------------------------------

//		List<Integer> integers = Arrays.asList(1, 2, 3, 5, 7, 4, 8, 9, 10);
//		Set<Integer> setIntegers=new HashSet<>(integers);
//		
//		setIntegers
//		.stream()
//		//.filter(n->n%2!=0)
//		//.map(n->n+10)
//		.forEach(item->System.out.println(item));

		// ---------------------------------------------------
		// from static elements & array
//		-----------------------------------------------------

//		Stream.of(1,2,3,4,5,6,7)
//		.forEach(System.out::println);
//		
//		Integer[] intArr= {1,2,3,4,5};
//		Stream.of(intArr)
//		.forEach(System.out::println);

		// ---------------------------------------------------
		// by computation
		// ---------------------------------------------------

		// a. Stream.generate()

//		Random random=new Random();
//		Stream<Integer> stream=Stream.generate(()->{
//				return random.nextInt();
//		});
//		
//		stream=stream
//		.peek(n->System.out.println("original :"+n))
//		.filter(n->n>0)
//		.peek(n->System.out.println("after filter :"+n))
//		.limit(5);
//		//.peek(n->System.out.println("after limit :"+n))
//		//.forEach(System.out::println);
//		
//		System.out.println("-------------------------------");
//		
//		stream
//		.forEach(System.out::println);
//		
//		System.out.println("-------------------------------");

//		---------------------------------------------------

//		Stream.iterate(1, n->n+1)
//		.limit(10)
//		.forEach(System.out::println);
//		
//		---------------------------------------------------
		
		

	}

}
