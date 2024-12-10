package Controlstatement;

import java.util.Scanner;

public class Divisibleby5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("enter num");
		int a=obj.nextInt();
		if(a%5==0) {
			System.out.println("is divisible");
		}
		else if(a%11==0) {
			System.out.println("is divisible");
		}
		else {
			System.out.println("not divided");
		}
	}

}
