package Arrays;

import java.util.Scanner;

public class Duplicate_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the len:");
		int a= sc.nextInt();
		System.out.println("Please enter elements here");
		int arr[]=new int [a];
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		 
		}
		for(int i=0;i<arr.length;i++) {
		     for (int j=i+1;j<arr.length;j++) {
		    	 if(arr[i]==arr[j]) {
		    		 System.out.println(arr[i]);
		    		 
		    		 break;
		    	 }	
		     }
		}
		
	}
}
