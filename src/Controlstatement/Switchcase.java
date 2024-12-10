package Controlstatement;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char operatoe;
		int res;
		Scanner obj = new Scanner(System.in );
		System.out.println("chose operator:+,-,*,/,%");
		String ope= obj.next();
			System.out.println("enter a :");
			int a= obj .nextInt();
		
				System.out.println("enter b:");
				 int b= obj.nextInt();
			switch(ope) {
			case "+" :
				res= a+b;
				 System.out.println(res);
				 break;
			case "-":
				res= a-b;
				 System.out.println(a+"-"+b+"="+res);
				 break;
			case "*":
				res= a*b;
				 System.out.println(a+"*"+b+"="+res);
				 break;
			case "/":
				res= a/b;
				 System.out.println(a+"/"+b+"="+res);
				 break;
			case "%":
				res= a%b;
				 System.out.println(a+"%"+b+"="+res);
				 break;
			}
	}

}
