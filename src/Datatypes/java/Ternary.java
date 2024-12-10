package Datatypes.java;

import java.util.Scanner;

public class Ternary {
	int a;
	public void display() {
	System.out.println("enter a:"+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj =new Scanner(System.in);
		
		System.out.println("enter :" );
       int a= obj.nextInt();
       Ternary b= new Ternary();
       
       b.display() ;
	
	    }
	}


	