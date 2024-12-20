package Arrays;

import java.util.Scanner;

public class Reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the element");
		int a=sc.nextInt();
		int b[]=new int[a];
		System.out.println("legth of array: "+b.length);
		for(int i=0;i<b.length;i++) {
		b[i]=sc.nextInt();
		System.out.println(b[i]);
		}
		System.out.println("-------------"); 
		for(int i=b.length-1 ;i>=0;i--) {
		System.out.println(b[i]);
		}
	}
	}


