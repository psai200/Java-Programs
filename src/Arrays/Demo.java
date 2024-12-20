package Arrays;

import java.util.Scanner;

public class Demo {
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 Scanner sc= new Scanner(System.in);
			 System.out.println("enter the element");
			 int  length =sc.nextInt();
			 int arr[]= new int [length];
			 int min=arr[0];
				int max = arr[0];
			 System.out.println("length    "+arr.length);
			 System.out.println("enter "+arr.length+"elments");
			 for(int i=0;i<arr.length;i++) {
				 arr[i]=sc.nextInt();
			 }
				 System.out.println("Data enter");
				for(int i=0;i<arr.length;i++) {
					 System.out.println(arr[i]);
					 if(arr[i]< min) {
							min=arr[i];
						}
						if(arr[i]>max) {
						max=arr[i];	
				
				 }
				 }
				 System.out.println("minimum"  +min);
				 System.out.println("maximum"  +max );
	}

}
