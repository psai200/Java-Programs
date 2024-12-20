package Arrays;

import java.util.Scanner;

public class Matrix_max_nim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the rows");
		int n = sc.nextInt();
		System.out.println("enter the colunm");
		int m = sc.nextInt();
		int arr [][]=new int [n][m];
		int min=0;
		int max=0;
		System.out.println("enter the value :");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {				
				arr[i][j]= sc.nextInt();
				
				if(min>arr[i][j]) {
					min=arr[i][j];
				}
				if(max<arr[i][j]) {
					max=arr[i][j];
				}
				}
			}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
			
				System.out.print(arr[i][j]+" ");
				}
			
			System.out.println();
		}
		System.out.println("minimum:"+min);
		System.out.println("maxmum:"+max);
	}

}
