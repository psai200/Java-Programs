package Looping;

import java.util.Scanner;

public class pattren_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//int a=5;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter number");
		 int a =obj.nextInt();
		for(int i=0;i<a;i++) {
			for(int j=i;j<a;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}

	}

}
