package Controlstatement;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		double  a = 4;
//		double b =3.0;
//		double c =5.0;
		Scanner obj =new Scanner(System.in);
		System.out.println("enter a:");
		double a=obj.nextDouble();
		System.out.println("enter b:");
		double b=obj.nextDouble();
		System.out.println("enter c:");
		double c=obj.nextDouble();
		if( (a + b > c) && (a + c > b) && (b + c > a)) {
			System.out.println("its triangle");
		}
		
		else {
			System.out.println("its not triangle");
		}
	}

}
