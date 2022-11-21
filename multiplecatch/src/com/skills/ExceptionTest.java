package com.skills;
import java.util.*;
import java.io.*;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter first number");
			String n1=br.readLine();
			System.out.println("Enter second number");
			String n2=br.readLine();
			int a=Integer.parseInt(n1);
			int b=Integer.parseInt(n2);
			Division d=new Division();
			double res=d.divide(a,b);
			System.out.println("Result:"+res);
		}catch(NumberFormatException nfe){
			System.out.println("Pass No's only");
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		catch(IOException ioe) {
			System.out.println("Reading failed");
		}
	}
}
class Division{
	public double divide(int a,int b)throws ArithmeticException{
		if(b==0) {
			throw new ArithmeticException("Don't pass 2nd as zero");
		}
		return a/b;
	}
}
