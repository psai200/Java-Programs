package Datatypes.java;

import java.util.Scanner;

public class Bitwiseandoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=4;
		int c= a&b;
		System.out.println(c );
		//
		Scanner i= new Scanner(System.in);
		System.out.println("enter d:");
		int d=i.nextInt();
		System.out.println("enter k:");
		int k=i.nextInt();
		
		int j=d&k;
		System.out.println(j);
	}

}
