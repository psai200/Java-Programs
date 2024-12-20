package Arrays;

import java.util.Scanner;

public class Adding_two_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the rows;");
		int row=sc.nextInt();
		System.out.println("enter the coloms;");
		int coloms=sc.nextInt();
		int a[][]=new int[row][coloms];
		int b[][]=new int[row][coloms];
		int c[][]=new int[row][coloms];
		 for(int i=0;i<a.length;i++) {
				for(int j=0;j<b.length;j++) {
					a[i][j]=sc.nextInt();
								}
	}
		 for(int i=0;i<a.length;i++) {
				for(int j=0;j<b.length;j++) {
					b[i][j]=sc.nextInt();
						}
		 }
		 for(int i=0;i<a.length;i++) {
				for(int j=0;j<b.length;j++) {
					c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
				}
				System.out.println();
		 }
	}

}
