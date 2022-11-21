package com.skills;

import java.io.*;

public class CheckedExceptionDemo {

	public static void main(String[] args)throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		fis=new FileInputStream("E:/Java/javaprogram/Welcome.txt");
		int i;
		while((i=fis.read())!= -1) {
			System.out.print((char)i+"");
		}
		fis.close();
	}

}
