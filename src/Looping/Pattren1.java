package Looping;

import java.util.Scanner;

public class Pattren1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		int row= 5;
		int number =15,n=1;
	
		for(int i=1; i<=row;i++) {
			for(int j=1; j<=i;j++) {
				 
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}
		
	}

}