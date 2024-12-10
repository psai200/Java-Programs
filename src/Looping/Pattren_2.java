package Looping;

import java.util.Scanner;

public class Pattren_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj =new Scanner(System.in);
		System.out.println("enter the number");
	
		int num =obj.nextInt();  
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if (j==i) {
					System.out.print("* ");
				}
				else {
					System.out.print(j+" ");
					
				}
			}
			System.out.println();
		}

	}

}
