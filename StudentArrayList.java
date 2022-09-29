/* Q 2.	Create an ArrayList object students, and store the following students in that list.

Student
	studentcode
	studentname
	age
	state

Student Code	Student Name	Age	State
AF0216223	Aryan Raj	21	Andra Pradhesh
AF0216224	Bivor Kumar	22	Andra Pradhesh
AF0216227	SUSHMITA KUMARI	23	Madhya Pradesh
AF0216231	Ragiv Zafar	24	Maharashtra
AF0216232	RAHUL MAHTO	25	Orissa
AF0216234	Nainsi Kumari	19	Gujarath
AF0216236	MD ALI	26	Madhya Pradesh
AF0216238	ABHISHEK KUMAR	22	Andra Pradhesh
AF0216240	AFROZ ANSARI	21	Maharashtra
AF0216259	RITIK RAJ	20	Orissa
AF0216263	Anant Kumar	25	Andra Pradhesh
AF0216305	BABU KUMAR	24	Gujarath
AF0216307	NIKITA KUMARI	23	Madhya Pradesh
AF0216353	PRANAV PANDEY	22	Orissa
AF0216964	Radheshyam Kumar	21	Maharashtra
AF0216973	Ankur Utpal	19	Gujarath
AF0217607	Banty Mishra	18	Madhya Pradesh
AF0217615	RIYA KUMARI	20	Karnataka
AF0217791	Priyadarshani Kumari	21	Maharashtra
AF0223373	Chanchal Thakur	22	Orissa
AF0221549	SATENDRA KUMAR	23	Maharashtra
AF0216212	Pappi Verma	24	
AF0216244	Ramkrishna Kushwah	25	Andra Pradhesh
AF0216245	Yogita Tamoliya	26	Orissa

Find the students aged over 20

Find students from the state Andhra Pradhesh

Sort students by their age.

	Sort students by state and student name.
*/
package com.collection.bill;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentArrayList {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Students> students = new ArrayList<>(); // creating a list

		// adding values in the list
		students.add(new Students("AF0216223", "Aryan Raj", 21, "Andhra Pradesh"));
		students.add(new Students("AF0216224", "Bivor Kumar", 22, "Andhra Pradesh"));
		students.add(new Students("AF0216227", "SUSHMITA KUMARI", 23, "Madhya Pradesh"));
		students.add(new Students("AF0216231", "Ragiv Zafar", 24, "Maharashtra"));
		students.add(new Students("AF0216232", "RAHUL MAHTO", 25, "Orissa"));
		students.add(new Students("AF0216234", "Nainsi Kumari", 19, "Gujarath"));
		students.add(new Students("AF0216236", "MD ALI", 26, "Madhya Pradesh"));
		students.add(new Students("AF0216238", "ABHISHEK KUMAR", 22, "Andhra Pradesh"));
		students.add(new Students("AF0216240", "AFROZ ANSARI", 21, "Maharashtra"));
		students.add(new Students("AF0216259", "RITIK RAJ", 20, "Orissa"));
		students.add(new Students("AF0216263", "Anant Kumar", 25, "Andhra Pradesh"));
		students.add(new Students("AF0216305", "BABU KUMAR", 24, "Gujarath"));
		students.add(new Students("AF0216307", "NIKITA KUMARI", 23, "Madhya Pradesh"));
		students.add(new Students("AF0216353", "PRANAV PANDEY", 22, "Orissa"));
		students.add(new Students("AF0216964", "Radheshyam Kumar", 21, "Maharashtra"));
		students.add(new Students("AF0216973", "Ankur Utpal", 19, "Gujarath"));
		students.add(new Students("AF0217607", "Banty Mishra", 18, "Madhya Pradesh"));
		students.add(new Students("AF0217615", "RIYA KUMARI", 20, "Madhya Pradesh"));
		students.add(new Students("AF0217791", "Priyadarshani Kumari", 21, "Maharashtra"));
		students.add(new Students("AF0223373", "Chanchal Thakur", 22, "Orissa"));
		students.add(new Students("AF0221549", "SATENDRA KUMAR", 23, "Maharashtra"));
		students.add(new Students("AF0216212", "Pappi Verma", 24, "Maharashtra"));
		students.add(new Students("AF0216244", "Ramkrishna Kushwah", 25, "Andhra Pradesh"));
		students.add(new Students("AF0216245", "Yogita Tamoliya", 26, "Orissa"));

		// Students age more than 20
		System.out.println("Students with age greater than 20 years..");
		for (Students student : students) {
			if (student.getAge() > 20)
				System.out.println(student);
		}

		/*
		 * //Students from the state Andhra Pradesh
		 * System.out.println("Students from Andhra Pradesh..."); for(Students student :
		 * students) { if(student.getState().equals("Andhra Pradesh"))
		 * System.out.println(student); }
		 */

		/*
		 * //Sorting Students according to their age
		 * System.out.println("sorting by age...");
		 * 
		 * Collections.sort(students,new AgeComparator()); for(Students student :
		 * students) { System.out.println(student); }
		 * 
		 */

		/*
		 * //Sorting Students by name and State 
		 * Collections.sort(students, new StateAndStudentNameComparator<Students>() {
		 * 
		 * @Override 
		 * public int compare(Students s1, Students s2) { return
		 * (s1.getStudentName().compareTo(s2.getStudentName())); } });
		 * Collections.sort(students, new StateAndStudentNameComparator<Students>() {
		 * 
		 * @Override public int compare(Students s1, Students s2) { return
		 * (s1.getState().compareTo(s2.getState())); } });
		 * 
		 * for(Students student:students) { System.out.println(student);
		 * System.out.println(); }
		 */

	}
}
