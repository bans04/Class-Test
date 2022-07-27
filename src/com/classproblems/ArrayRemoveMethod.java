package com.classproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayRemoveMethod {

	public static void main(String[] args) {
		ArrayList<Integer> intArray = new ArrayList<>();
		intArray.add(6567);
		intArray.add(787);
		intArray.add(344);
		intArray.add(797);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter which index element U want to remove:-> ");
		int index = scanner.nextInt();
		intArray.remove(index);
		
		Collections.sort(intArray);
		System.out.println(intArray);
	}
}
