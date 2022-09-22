/*Create your own HashSet object with initial capacity of 5
Add the following objects to the newly created HashSet object
2 String objects
2 MyOwnClass object(You will have to create MyOwnClass.java first)
3 Integer objects
Display the HashSet object*/


package com.coll.demo;

import java.util.HashSet;

public class Hashset {
  public static void main(String[] args) {
	
	  HashSet h=new HashSet(5);
	  
	  h.add("naveen");
	  h.add("ashwin");
	  
	  h.add(new Naveen("raja",66));
	 
	  
	  h.add(55);
	  h.add(88);
	  h.add(84);
	  
	  System.out.println(h);

	  
}
}
