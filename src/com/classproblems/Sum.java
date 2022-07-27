package com.classproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		ArrayList<Integer> intNum = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter last limit upto U want to sum:-> ");
		int intLimit = scanner.nextInt();
		for(int i = 0; i < intLimit; i++) {
			intNum.add(i);
		}
		
		int sum = intNum.stream().mapToInt(num -> num).sum();
		System.out.println(sum);
	}

}
