package com;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

enum Gender{
	MALE,FEMALE
}
class Employee{
	private String name;
	private double salary;
	private Gender gender;
	public Employee(String name, double salary, Gender gender) {
		super();
		this.name = name;
		this.salary = salary;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", gender=" + gender + "]";
	}
	
}

public class StreamAPI_Custom_Terminal_Ops {
	
	public static void main(String[] args) {
		
		//-------------------------------------------------------
		// a. reduce()  ==> immutable
		//-------------------------------------------------------
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		int sum=
		list
		.stream()
		.filter(n->n%2>20)
		.reduce((acc,next)->{
			//System.out.println("acc-"+acc);
			//System.out.println("next-"+next);
			return acc+next;
		}).orElse(0);
		
		System.out.println(sum);
		

		//-------------------------------------------------------
		// a. collect()   ==> mutable
		//-------------------------------------------------------
		
		
		String str="a,b,c,d,a,b,c,e,f,f,g,h";
		String[] tokens=str.split(",");
		
		//StringBuilder builder=
		System.out.println(
				
			Stream.of(tokens)
			.map(String::toUpperCase)
	//		.collect(
	//				()->new StringBuilder(),
	//				(sb,token)->sb.append(token +" "), 
	//				(sb1,sb2)->sb1.append(sb2)
	//				);
			//.collect(Collectors.joining(" ","[", "]"));
			//.collect(Collectors.toCollection(()->new TreeSet<>()))
			//.collect(Collectors.toList())
			.collect(Collectors.toSet())
		
		);
		
//		-------------------------------------------------------
		
		
		Employee[] employees= {
				new Employee("abc", 100.00, Gender.MALE),
				new Employee("xyz", 200.00, Gender.MALE),
				new Employee("pqr", 300.00, Gender.FEMALE),
				new Employee("ijk", 400.00, Gender.MALE),
				new Employee("mno", 500.00, Gender.FEMALE)
		};
		
		
		System.out.println(
		
		Stream.of(employees)
		//.filter(e->e.getSalary()>100)
		//.collect(Collectors.toMap(Employee::getName, Employee::getSalary))
	    //.collect(Collectors.groupingBy(Employee::getGender))
		.collect(Collectors.partitioningBy(e->e.getSalary()>100))
		);
		
		
		
		
		
		
		
		
		
	}

}
