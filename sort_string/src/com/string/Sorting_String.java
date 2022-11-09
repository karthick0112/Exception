package com.string;
import java.util.Arrays;
public class Sorting_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sa= {"Mango","Bananna","Apple","Pineapple","Graphs","Kiwi"};
		for(String i:sa) 
			System.out.println(i+"");
		System.out.println("After Sorting");
		Arrays.sort(sa);
		System.out.println(Arrays.toString(sa));
	}

}
