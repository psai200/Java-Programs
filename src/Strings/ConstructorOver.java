package Strings;

import java.util.Scanner;

public class ConstructorOver {
	ConstructorOver(){
		System.out.println();
	}
	ConstructorOver(int a,int b,int c){
		System.out.println("a+b="+(a+b));
		System.out.println("b*c="+(b*c));
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a:");
		int num= obj.nextInt();
		System.out.println("enter b:");
		int num2= obj.nextInt();
		System.out.println("enter c:");
		int num3= obj.nextInt();
		ConstructorOver d= new ConstructorOver();
		ConstructorOver d1= new ConstructorOver(num,num2,num3);


	}

}
