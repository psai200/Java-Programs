package Controlstatement;

import java.util.Scanner;

public class Student_top {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("enter  college");
		String a =obj.next();
		 int student;
		 do {
			 System.out.println("choose student");
			 System.out.println(" 1 student");
			 System.out.println("2 student");
			 System.out.println("3  student");
			 System.out.println("4 student");
		 System.out.println("enter steudent");
		  student=obj.nextInt();
		 switch(student) {
		 case 1:System.out.println("enter Hallticket no:");
		 		int Hallticketno= obj.nextInt();
		 		System.out.println("enter marks");
		 		int marks=obj.nextInt();
		 		if( marks<=1000) {
		 			System.out.println("sai");
		 			System.out.println("1st rank");
		 			}
		 		break;
		 		case 2:System.out.println("enter Hallticket no:");
			 		int Hallticketno1= obj.nextInt();
			 		System.out.println("enter marks");
			 		int marks1=obj.nextInt();
			 		if( marks1<=1000) {
			 			System.out.println("gari");
			 			System.out.println("2nd rank");
			 			
			 		}
			 		break;
		 			case 3:System.out.println("enter Hallticket no:");
			 		int Hallticketno3= obj.nextInt();
			 		System.out.println("enter marks");
			 		int marks2=obj.nextInt();
			 		if( marks2<=1000) {
			 			System.out.println("balu");
			 			System.out.println("3rd rank");
			 			
			 		}
			 		break;
		 			case 4:System.out.println("enter Hallticket no:");
			 		int Hallticketno4= obj.nextInt();
			 		System.out.println("enter marks");
			 		int marks3=obj.nextInt();
			 		if( marks3<=1000) {
			 			System.out.println("lalli");
			 			System.out.println("4st rank");
			 			
			 		}
			 		break;
			 		default: System.out.println("invalid");
		 
		 }
		 
		 }while(student !=5); 
			 
			 
		 }
		 
         
		 
	}



