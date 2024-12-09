package Controlstatement;

import java.util.Scanner;

public class Switchif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int day =4;
		Scanner obj =new Scanner(System.in);
		System.out.println("enter the week");
		int day = obj.nextInt();
		switch(day) {
		case 1:;
		case 2:;
		case 3:;
		case 4:;
		default:;
		if(day==1) 
			System.out.println("monday");
		
		else if(day==2) 
			System.out.println("tuesday");
		
		else if(day==3)
			System.out.println("wednesday");
		else if(day==4) 
			System.out.println("thursday");
		
		else {
			System.out.println("invalid day");
		}
		}
		}
	}	