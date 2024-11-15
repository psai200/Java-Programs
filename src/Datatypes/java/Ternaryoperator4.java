package Datatypes.java;

import java.util.Scanner;

public class Ternaryoperator4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner b =new Scanner(System.in);
		System.out.println("entey age:");
		int age = b .nextInt();
		String a = (age>18 )?("eligible vote"+age):("not eligible"+age);
		System.out.println(a);
}

}
