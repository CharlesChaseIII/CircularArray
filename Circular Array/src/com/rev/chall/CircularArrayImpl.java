package com.rev.chall;

public class CircularArrayImpl<T> {
	public T item;

	public String[] characterSelect = new String[5];

	public int[] numbers = new int[5];

	//public char[] letters = new char[5];

	// generic <f> = new generic();

	// int[] characterSelect = new generic<f>();
	
	public void showDetails(T[] item) {
		System.out.print("Type of object: " + 
	    item.getClass().getName());
	}

	public void rotateThroughCharacters(T[] item) {

	  int accumulator = 0; 
	  
	  System.out.print("Here is the circular rotation of items: ");

	  for (int i = 0; i < item.length; i++) {
	  
	  System.out.print(item[i] 
			  + "\r\n");

	  //accumulator++;

	  }

	    //accumulator++;
	  System.out.print(item[accumulator] + "\r\n");
	    //return item[accumulator];

	 }
	
}

