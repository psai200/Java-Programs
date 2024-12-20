package Arrays;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the name");
	    String a=sc.next();
	    String b[]=new String [a.length()];
	    System.out.println("length of string :"+b.length);
	    for(int i=0;i<b.length;i++) {
		b[i] = String.valueOf(a.charAt(i));
		System.out.println(b[i]);
	   }
	    for(int i=b.length-1;i>=0;i--) {
	    	System.out.println("enter :"+b[i]);
	    }
	}

}
