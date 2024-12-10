package Looping;

import java.util.Scanner;

public class Odd_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a:");
		int a= obj.nextInt();
		
		for(int i=1;i<=a;i+=2) {
			System.out.println(i);
			
		}
		
	}

}
