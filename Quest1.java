/* Q 1.	Create a list of elements as shown below into the LinkedList and name it as languages.

C
C++
Java
Kotlin
Python
Perl
Ruby

Display the created list.

Remove an element at index 5 and display the list

Remove ‘Kotlin’ and display the list

Remove all the scripting languages (Python, Ruby, Perl) with one statement and display the list.

Remove all the elements from the list and display the list.
*/




package com.collection.bill;

import java.util.LinkedList;

class Quest1 {
	public static void main(String[] args) {
		LinkedList<String> lang = new LinkedList<>();

		lang.add("C");
		lang.add("C++");
		lang.add("Java");
		lang.add("Kotlin");
		lang.add("Python");
		lang.add("Perl");
		lang.add("Ruby");

		System.out.println("LinkedList: " + lang);

		/*
		 * // remove elements from index 5 String str = lang.remove(5);
		 * System.out.println("Removed Element: " + str);
		 * System.out.println("Updated LinkedList: " + lang);
		 */

		/*
		 * // remove Kotlin from list
		 * 
		 * boolean str = lang.remove("Kotlin");
		 * 
		 * if(str == true) { System.out.println("Updated LinkedList: " + lang); }
		 */

		/*
		 * // remove elements in a single statement LinkedList<String> lang2 = new
		 * LinkedList<>(); lang2.add("Python"); lang2.add("Perl"); lang2.add("Ruby");
		 * 
		 * lang.removeAll(lang2); System.out.println("Updated LinkedList: " + lang);
		 */

		/*
		 * //remove all elements from a list
		 * 
		 * lang.clear(); System.out.println("Updated LinkedList: " + lang);
		 */

	}
}