package Strings;

import java.util.Scanner;

public class Odd_or_evenlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       String a = "hell";
//       System.out.println(a.length());
		Scanner obj=new Scanner(System.in);
		System.out.println("enter name");
		String a=obj.next();
		System.out.println(a.length());
       int v= a.length();
       if( v%2==0) {
    	   System.out.println("even");
       }
       
       else {
    	   System.out.println("odd num");
       }
	}

}
