package Controlstatement;

import java.util.Scanner;

public class Long {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="balu";
	    String  a = "s135";
	
		Scanner d = new Scanner(System.in);
		System.out.println("enter the username");
		String username =  d.next();
		System.out.println("enter the number"); 
		String password= d.next();
		if(s.equals(username)&& a.equals(password)) {
			System.out.println("longin sucess");
		}
		else {
			System.out.println("invalid details");
			
		}  
		
		

	}

}
