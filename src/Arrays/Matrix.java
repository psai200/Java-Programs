package Arrays;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner(System.in);
		
		System.out.println("enter the rows");
		int n=sc.nextInt();
		System.out.println("enter the coloum");
		int n1 =sc .nextInt();
		 int[][] arr1=new int[n][n1];

		 System.out.println("enter the value :");
		 
		 for(int i=0;i<n;i++) {
				for(int j=0;j<n1;j++) {
					
					 arr1[i][j]=sc.nextInt();
					 
					 
				}
		 }
				 for(int i=0;i<n;i++) {
						for(int j=0;j<n1;j++) {				
							 System.out.print(arr1[i][j]+" ");
							 
						}
				 
				System.out.println();
				 }
					
				
			
		
			}
}

