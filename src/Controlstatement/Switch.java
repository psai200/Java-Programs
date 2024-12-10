package Controlstatement;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj =new Scanner(System.in);
		System.out.println("enter the month :");
		int month=obj.nextInt();
		int days;
		switch(month) {
		case 1:System.out.println("january");
		days=31;
		System.out.println(   days + " days");
		break;
		case 2:System.out.println("feb");
		days=28;
		System.out.println(   days + " days");
		break;
		case 3:System.out.println(" march");
		days=31;
		System.out.println(   days + " days");
		break;
		case 4:System.out.println(" april");
		days=30;
		System.out.println(   days + " days");
		break;
		case 5:System.out.println("may");
		days=31;
		System.out.println(   days + " days");
		break;
		case 6:System.out.println("june");
		days=30;
		System.out.println(   days + " days");
		break;
		case 7:System.out.println("july");
		days=31;
		System.out.println(   days + " days");
		break;
		case 8:System.out.println("August");
		days=31;
		System.out.println(   days + " days");
		break;
		case 9:System.out.println("sebtember");
		days=30;
		System.out.println(   days + " days");
		break;
		case 10:System.out.println("october");
		days=31;
		System.out.println(   days + " days");
		break;
		case 11:System.out.println("november");
		days=30;
		System.out.println(   days + " days");
		break;
		case 12:System.out.println("december");
		days=31;
		System.out.println(   days + " days");
		break;
		
		default: System.out.println("invalid month");
		
		}

	}

}
