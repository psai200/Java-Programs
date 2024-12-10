package Strings;

import java.util.Scanner;

public class Add_to_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner obj =new Scanner(System.in);
      System.out.println("enter a:");
      String a=obj.next();
      System.out.println("enter b:");
      String b=obj.next();
      System.out.println("enter c:");
      String c=obj.next();
      int n=a.length();
      int n2=b.length();
      int n3=c.length();
      int d= n+n2+ n3;
      //int f=d*n3;
      System.out.println(d);
      
	}

}
