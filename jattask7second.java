package jattask7;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class jattask7second {

	public static void main(String[] args) {
		

	  {
		        // Creating a list of integers
		        List<Integer> list = new ArrayList<>();
		        list.add(10);
		        list.add(20);
		        list.add(30);
		        list.add(40);
		        
		        // Converting list to array
		        Integer[] array = new Integer[list.size()];
		        array = list.toArray(array);

		        // Printing the array
		        System.out.println("Array elements:");
		        for (Integer num : array) {
		            System.out.println(num);
		        }
		    }
		}
		// TODO Auto-generated method stub

	}


