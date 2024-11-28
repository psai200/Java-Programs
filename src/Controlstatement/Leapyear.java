package Controlstatement;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int year=2020;
		Scanner obj= new Scanner(System.in);;
		System.out.println("enter the year");
		int year = obj. nextInt();
		if(year%4==0) { 
			 System.out.println("leapyear");
		}
		else if(year%100==0) {
			System.out.println("leapyear");
		 }
		else if(year%400==0) {
			System.out.println("leapyear");
		}
		else {
			System.out.println(" not a leapyear");
		}
	}

}
