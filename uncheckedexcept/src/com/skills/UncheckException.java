package com.skills;
public class UncheckException {

	public static void main(String[] args) {
		int a[]= {7,8,2,5};
		a[2]=15;
		for(int i:a) {
			System.out.println(i+"");
		}
	}

}
