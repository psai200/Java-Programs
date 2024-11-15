package Controlstatement;

import java.util.Scanner;

public class Student {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj =new Scanner(System.in);
		System.out.println("enter number:");
		int a=obj.nextInt();
		System.out.println("enter the studet");
		int student=obj.nextInt();
		
		switch(student) {
		case 1 : 
				System.out.println("hari");
		        int marks= 40;
		        String c=marks>35?"pass":"fail";
		        System.out.println(marks);
		        System.out.println(c);
		        break;
		 case 2 :
				System.out.println("siva");
		        int marks1= 22;
		        String d=marks1>35?"pass":"fail";
		        System.out.println(marks1);
		        System.out.println(d);
		        break;
		  case 3: 
				System.out.println("hara");
		        int marks2= 40;
		        String e=marks2>35?"pass":"fail";
		        System.out.println(marks2);
		        System.out.println(e);
		        break;
		   case 4 :System.out.println("id4"); 
				System.out.println("");
		        int mark= 20;
		        String f=mark>35?"pass":"fail";
		        System.out.println(mark);
		        System.out.println(f);
		        break;
		  case 5 : 
				System.out.println("hari");
		        int marks3= 70;
		        String g=marks3>35?"pass":"fail";
		        System.out.println(marks3);
		        System.out.println(g);
		        break;
		  case 6 : 
				System.out.println("hari");
		        int marks4= 49;
		        String i=marks4>35?"pass":"fail";
		        System.out.println(marks4);
		        System.out.println(i);
		        break;
		}    
		        
	
	}

}
