package com.atmecs.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaTest {

	public static void main(String[] args) {
		Comparator<Employee> sortByName = new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return e1.getName().compareTo(e2.getName());
			}
		};
		
		Comparator<Employee> lambdaSortByName = (Employee e1, Employee e2)->e1.getName().compareTo(e2.getName());

		// Initial data
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(500, "Shifoo", 150000));
		list.add(new Employee(504, "Oogway", 120000));
		list.add(new Employee(502, "Tigress", 100000));
		list.add(new Employee(730, "Mantis", 45000));
		 
		System.out.println("Initial List :");
		list.forEach(System.out::println);
		 
		//sortByName already defined in above snippet
		Collections.sort(list, sortByName);
		System.out.println("\nStandard Sorted by Name :");
		list.forEach(employee -> System.out.println(employee.getName()+"-"+employee.getId()+"-"+employee.getSalary()));
		 
		//lambdaSortByName already defined in above snippet
		list.sort(lambdaSortByName);
		System.out.println("\nLambda Sorted by Name :");
		list.forEach(employee -> System.out.println(employee.getName()+"-"+employee.getId()+"-"+employee.getSalary()));
		 
		Comparator<Employee> lambdaSortById = (Employee e1, Employee e2) -> e1.getId() - e2.getId();
		list.sort(lambdaSortById);
		System.out.println("\nLambda Sorted by Id :");
		list.forEach(employee -> System.out.println(employee.getId()+"-"+employee.getName()+"-"+employee.getSalary()));

	}

}
