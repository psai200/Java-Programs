package Arrays;

import java.util.Scanner;

public class Evennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row");
		int a=sc.nextInt();
		System.out.println("enter colom");
		int b=sc.nextInt();
		int[][]arr=new int[a][b];
		System.out.println("----------------");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length ;j++) {
				int num=sc.nextInt();
				if(num%2==0) {
			arr[i][j]=num;
				   
				}
				else {
					arr[i][j]=0;	
				}
				
				}
			}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length ;j++) {
		System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
