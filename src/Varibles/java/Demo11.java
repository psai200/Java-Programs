package Varibles.java;

import java.util.Scanner;

public class Demo11 {
	int a;
	public Demo11(int a) {
		this.a = a;
	}
	public  void display() {
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj= new Scanner(System.in);
		System.out.println("enter a:");
		int  a= obj.nextInt();
		Demo11 b =new Demo11(a);
		
		    }
		}


	

