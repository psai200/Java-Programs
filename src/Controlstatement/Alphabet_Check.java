package Controlstatement;

import java.util.Scanner;

public class Alphabet_Check {

	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);
		System.out.println("enter the charater");
		char a=obj.next().charAt(0);
	if(Character.isLetter(a)) {
		 char ch= Character.toLowerCase(a)	;
		 if(ch=='a'|| ch=='e'||ch=='i'||ch=='o' ||ch=='u') {
			 System.out.println("is vowel");
		 }
		 else {
			 System.out.println("is constsnt");
		 }
			
		}
		else if (Character.isDigit(a)) {
			System.out.println("digit");
		}
		else {
			System.out.println("special character");
		}
	}
}
