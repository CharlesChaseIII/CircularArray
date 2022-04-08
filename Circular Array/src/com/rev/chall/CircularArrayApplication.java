package com.rev.chall;

import java.util.ArrayList;
import java.util.List;

public class CircularArrayApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 CircularArrayImpl<String> genericObj = 
	        		new CircularArrayImpl<String>();
		
        String[] strArray = {"food","balls","drinks"};
        Integer[] intArray = {5,6,7};		
        
        //List<Integer> intArray = 
        		//new ArrayList<Integer>();
        
        /*strArray.add("food");
        strArray.add("balls");
        strArray.add("drinks");
        intArray.add(5);
        intArray.add(6);
        intArray.add(7);*/
        
      
      
      genericObj.rotateThroughCharacters(strArray);
      genericObj.showDetails(strArray);
      //genericObj.rotateThroughCharacters(intArray);
	}
	
	

}
