package Datatypes.java;

import java.util.Scanner;

public class Logical {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e = new Scanner(System.in);
		System.out.println("enter value a:");
		int a=e. nextInt();
		System.out.println("enter value b:");
		int b=e. nextInt();
		System.out.println("enter value c:");
		int c=e. nextInt();
		System.out.println("enter value d:");
		int d=e. nextInt();
		boolean i= (a>=b && c==d);//flase
		boolean j= (a>b && c<d);//true
		System.out.println(i);
		System.out.println(j);
		boolean k= (a>=b || c==d);//true
		boolean l= (a<b || c<=d);//true
		System.out.println(k);
		System.out.println(l);
		boolean m= !(a>=b );//flase
		boolean n=! (c==d);//true
		System.out.println(m);
		System.out.println(n);
		
		
		
	}

}
