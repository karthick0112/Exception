package com.skills;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			var d=100/0;
		}catch(ArithmeticException e) {
			System.out.println(e);
		}System.out.println("......");
	}

}
