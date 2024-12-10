package Strings;

import java.util.Scanner;
import java .lang.*;
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner str = new Scanner(System.in);
//		System.out.println("enter the name");
//		String name=str.next();
		String s= new String("Hello");
		System.out.println(s);
		s=s.concat("hii");
		System.out.println(s.indexOf("e")); 
		System.out.println(s.length());
		System.out.println(s.charAt(4));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.compareTo("Hello"));
		System.out.println(s.trim());
		System.out.println(s.replace("Hello","sai"));
		
	}}

