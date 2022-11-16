package com.skills;

record Student(int rollno,String name,int fee) {
	Student(){
		this(101,"raju",1500);
	}
public static void main(String args[]) {
	Student s=new Student(101,"velu",1500);
	Student s1=new Student(102,"Arun",1500);
	Student s2=new Student(103,"Sai",1500);
	Student s3=new Student(104,"Mark",1500);
	Student s4=new Student(105,"Subu",1500);
	
	System.out.println(s);
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
}
}
