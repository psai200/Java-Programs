package java_progrms;

import java.util.Scanner;

public class StudentPassorFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StudentPassorFail obj = new StudentPassorFail();
		System.out.println("enter the sudent details");
	
		System.out.println("enter the student hall ticket number");
		int number=sc.nextInt();
		System.out.println("enter the student marks");
		int marks = sc.nextInt();
		if (marks <= 35) {
			System.out.println("just  pass");
		}
		else if(marks<=35|| marks<=50) {
			System.out.println("C grade");
			
		}
		else if(marks<=50 ||  marks <=75 ) {
			System.out.println("B grade");
			
		}
		else if(marks<=75) {
			System.out.println("B+ grade");
		}
		else if(marks>=90) {
			System.out.println("A grade");
		}
		else if(marks>100) {
			System.out.println("A+ grade");
		}

		else {
			System.out.println("fail");
		}

	}

}
