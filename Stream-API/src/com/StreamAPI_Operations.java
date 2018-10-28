package com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

class Todo implements Comparable<Todo> {

	private int id;
	private String title;
	private boolean comleted;

	public Todo(int id, String title, boolean comleted) {
		super();
		this.id = id;
		this.title = title;
		this.comleted = comleted;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isComleted() {
		return comleted;
	}

	public void setComleted(boolean comleted) {
		this.comleted = comleted;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + ", comleted=" + comleted + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (comleted ? 1231 : 1237);
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (comleted != other.comleted)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public int compareTo(Todo o) {
		return Integer.compare(this.id, o.id);
	}

	public Todo() {
		// TODO Auto-generated constructor stub
	}

}

public class StreamAPI_Operations {

	public static void main(String[] args) {

		Todo[] todos = { 
				new Todo(0, "ng tng", false), 
				new Todo(1, "java tng", false), 
				new Todo(3, "react tng", false),
				new Todo(2, "react tng", true), 
				new Todo(4, "go home", false), 
				};

		// ----------------------------------------
		// 1- Filtering operation
		// ----------------------------------------

		// Arrays.stream(todos)
		// .filter(todo->todo.isComleted())
		// .limit(2)
		// .distinct()
		// .forEach(System.out::println);

		// ----------------------------------------
		// 2- Transforming operation
		// ----------------------------------------

		// A. map

//		Arrays.stream(todos)
//		.map(todo->todo.getTitle())
//		.forEach(System.out::println);

//		B. FlatMap

//		String[] menu= {"idly,vada,poori","cb,mb,fb,pb"};
//		Arrays.stream(menu)
//		.flatMap(m->Arrays.stream(m.split("[,]")))
//		.map(String::toUpperCase)
//		.forEach(System.out::println);

		// ----------------------------------------
		// 3- sorting
		// ----------------------------------------

//		
//		Arrays.stream(todos)
//		//.sorted((o1,o2)->o1.getTitle().compareTo(o2.getTitle()))
//		.sorted(Comparator.comparing(Todo::getTitle).reversed())
//		.forEach(System.out::println);

		// ----------------------------------------
		// 3- Terminal
		// ----------------------------------------
//		
//		boolean b=Arrays.stream(todos)
//		//.allMatch(todo->todo.isComleted());
//		//.anyMatch(todo->todo.isComleted());
//		  .noneMatch(todo->todo.getTitle().equals("go holiday"));		
//		System.out.println(b);

//		Todo[] arr=Arrays.stream(todos)
//		.filter(Todo::isComleted)
//		//.toArray();
//		//.toArray(n->new Todo[n]);
//		.toArray(Todo[]::new);
//		
//		for(Todo o:arr) {
//			System.out.println(o);
//		}

		Optional<Todo> optional = Arrays.stream(todos)
				.filter(Todo::isComleted)
				.findFirst();
		
		//--------------------------------------------
	}

}
