package Controlstatement;

import java.util.Scanner;

public class Laregest_threenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj =new Scanner(System.in);
		System.out.println("enter the num a:");
		int a = obj.nextInt();
		Scanner o =new Scanner(System.in);
		System.out.println("enter the num b:");
		int b = o.nextInt();
		Scanner j =new Scanner(System.in);
		System.out.println("enter the num c:");
		int c = j.nextInt();
		
		//int a=10,b=1,c=6;
		if(a>b && a>c) {
			System.out.println("a is big");
		}
		else if(b>a && b>c) {
			System.out.println("b is big");
		}

		else{
			System.out.println(" c is big");
		}

	}

}
