package Looping;

import java.util.Scanner;

public class pattren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //int row=5;
        Scanner obj =new Scanner(System.in); 
         System.out.println("entetr the rows");
         int rows=obj.nextInt();
         for(int i=rows;i>=1;i--) {
         for(int j=1;j<=i;j++) {
        	 System.out.print(" * ");
        	
         }
         System.out.println();
	}
	}

}
