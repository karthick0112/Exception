package com.skskills;

public class String_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Anudip foundation";
		String s2="anudip";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.indexOf("I"));
		System.out.println(s1.indexOf("i"));
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(1,5));
		System.out.println(s2+"found");
		System.out.println(s1.contains("anu"));
		System.out.println(s1.concat(s2));
		System.out.println(s2.startsWith("a"));
		System.out.println(s1.endsWith("p"));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.repeat(3)+"");
		System.out.println(s1.replace("f","F"));
		
	}

}
