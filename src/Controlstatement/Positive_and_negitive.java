package Controlstatement;

import java.util.Scanner;

public class Positive_and_negitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // int a=-1;
		Scanner obj =new Scanner(System.in);
		System.out.println("enter num");
		int a=obj.nextInt();
    
         if(a>=0) {
        	 System.out.println("positive num");
         }
         else {
         System.out.println("negitive  num");
    }
	}

}
