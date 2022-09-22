/*Create your own HashSet object
Add the following objects with properly initialized values to the newly created HashSet object
2 String objects
2 MyOwnClass object (You will have to create MyOwnClass.java first)
MyOwnClass class has name (String type) and age (int type)
3 Integer ojbects
Create Iterator object from the HashSet object and iterate them to get displayed*/





package com.coll.demo;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 {

	public static void main(String[] args) {
		
		HashSet set=new HashSet();
		
		set.add("student");
		set.add("teacher");
		
		set.add(new Teacher("naveen",21));
		
		set.add(58);
		set.add(66);
		set.add(48);
		
		Iterator i=set.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
