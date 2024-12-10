package Controlstatement;

import java.util.Scanner;

public class Vote_eligible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner (System.in);
		System.out.println("enter age");
		int a =s.nextInt();
//	System.out.println("enter age");
//		int b=s.nextInt();
		if(a>=18) {
			System.out.println("eligible for vote");
		
		System.out.println("enter age");
			int b=s.nextInt();
			if(b>=25) {
			System.out.println("eligible for contest");
			
			}
		}
		else {
			System.out.println(" not eligible");
		}

	}

}
