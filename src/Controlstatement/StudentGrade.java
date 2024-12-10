package Controlstatement;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Scanner obj =new Scanner(System.in);
		System.out.println("enter a:");
		int a= obj.nextInt();
		//int a=85;
		if(a<=34) {
			System.out.println("fail");
		}
		
		else if(a==35) {
			System.out.println("pass");
		}
		
		else if(a>=50 && a<=50) {
			System.out.println("B");
		}
		else if(a>=50&&a<=70) {
			System.out.println("B+");
		}
		else if(a>=70&&a<=100) {
			System.out.println("A");
		}
	}
	
}	
	
		