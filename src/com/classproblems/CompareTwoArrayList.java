package com.classproblems;

import java.util.ArrayList;
import java.util.List;

public class CompareTwoArrayList {

	public static void main(String[] args) {
		ArrayList<String> firstList=new ArrayList<String>();  
		firstList.add("Apple");  
		firstList.add("Pears");  
		firstList.add("Guava");  
		firstList.add("Mango");  
		System.out.println(firstList);  
		
		List<String> secondList=new ArrayList<String>();  
		secondList.add("Apple");  
		secondList.add("Pears");  
		secondList.add("Guava");  
		secondList.add("Mango");  
		System.out.println(secondList);  
		
		boolean boolval = firstList.equals(secondList);  
		System.out.println(boolval);  
	}

}
