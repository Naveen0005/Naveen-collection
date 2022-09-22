
/*project named as MyOwnArrayList
Create your own ArrayList object with initial capacity of 5
Add the following objects to the newly created ArrayList object.
2 String objects
1 MyOwnClass object (You will have to create MyOwnClass.java first)
3 Integer ojbects
Create Iterator object from the ArrayList object and iterate them to get displayed
Create Object array from the ArrayList object and display them in a for loop*/


package com.coll.demo;
import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList list= new ArrayList(5);
		
		list.add("naveen");
		list.add("mani");
		
		list.add(new Ashwin("ashwin"));
		
		list.add(100);
		list.add(66);
		list.add(88);
		
		System.out.println(list);
		
		for(Iterator i=list.iterator();
		i.hasNext();)		
		System.out.println(i.next());
		}

	}


