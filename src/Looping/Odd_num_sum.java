package Looping;

import java.util.Scanner;

public class Odd_num_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a:");
		int a= obj.nextInt();
		System.out.println("enter b:");
		int b= obj.nextInt();
		for(int i=1;i<=a;i+=2) {
			System.out.println(i);
			b+=i;
		}
		System.out.println(b);

	}

}
