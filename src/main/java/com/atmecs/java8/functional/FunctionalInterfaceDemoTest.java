package com.atmecs.java8.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaceDemoTest
{

	public static void main(String[] args)
	{
		List<Student> listOfStudents = new ArrayList<Student>();

		listOfStudents.add(new Student(111, "S1", 81.0, "Mathematics"));
		listOfStudents.add(new Student(222, "Harsha", 79.5, "History"));
		listOfStudents.add(new Student(333, "S2", 87.2, "Computers"));
		listOfStudents.add(new Student(444, "S3", 63.2, "Mathematics"));
		listOfStudents.add(new Student(555, "A1", 83.5, "Computers"));
		listOfStudents.add(new Student(666, "B1", 58.5, "Geography"));
		listOfStudents.add(new Student(777, "C1", 72.6, "Banking"));
		listOfStudents.add(new Student(888, "C2", 86.7, "History"));
		listOfStudents.add(new Student(999, "H1", 58.6, "Finance"));
		listOfStudents.add(new Student(101010, "F1", 89.8, "Computers"));
		
		//want only a list of "Mathematics" specialization students from the listOfStudents. Let’s see how to do it using Predicate.
		Predicate<Student> mathPredicates = (Student student) -> student.getSpecialization().equals("Mathematics");
		List<Student> mathStudentsList = new ArrayList<Student>();
		for(Student stu:listOfStudents)
		{
			if(mathPredicates.test(stu))
			{
				mathStudentsList.add(stu);
			}
		}
		//Consumer
		Consumer<Student> percentageConsumer = (Student std) ->{System.out.println(std.getName()+"-"+std.getPercentage());};
		for(Student std:listOfStudents)
		{
			percentageConsumer.accept(std);
		}
		
		//
		Function<Student, String> nameFunction = (Student std)->std.getName();
		List<String> stdNameList = new ArrayList<>();
		
		for(Student std: listOfStudents)
		{
			stdNameList.add(nameFunction.apply(std));
		}
		
	}
}
