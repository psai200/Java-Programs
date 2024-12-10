package Looping;

import java.util.Scanner;

public class Student_details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj= new Scanner(System.in);
		System.out.println("enter no of student: ");
		int noofstudent=obj.nextInt();
		for(int i=1;i<noofstudent;i++) {
			System.out.println("enter student details:");
			System.out.println("enrter Hallticket no:");
			int hallticket=obj.nextInt();
			System.out.println("enrter student name");
			String name= obj.next();
			System.out.println("enrter marks");
			int marks=obj.nextInt();
			String a=(marks>35)?"pass":"fail";
			System.out.println("enter student details:"+ i+":");
			System.out.println(" Hallticket no:" +  hallticket);
			System.out.println("  name"  + name);
			System.out.println(" marks" +   marks);
			System.out.println(a);
			System.out.println("************");
		}
			
		}

	}


