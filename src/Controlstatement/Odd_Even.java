package Controlstatement;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d=new Scanner(System.in);
		System.out.println("enter  number a:");
		int a= d.nextInt();
		if(a%2==1) {
			System.out.println("odd number");
			
			Scanner obj=new Scanner(System.in);
			System.out.println("enter  number b:");
			int b=obj.nextInt();
		
			if(a%2==0) {
				System.out.println("odd number");
			}
			else {
				System.out.println("even number");
			}
			
		}
		else {
			System.out.println("even number");
			
		}

	}

}
