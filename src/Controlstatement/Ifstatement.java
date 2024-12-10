package Controlstatement;

import java.util.Scanner;

public class Ifstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner h=new Scanner(System.in);
	System.out.println("enter a week");
	String a= h.nextLine();
		 
	 if ( a.equals("monday")){
		 System.out.println("weekday  "+a);
	 }
	 else if (a.equals("tuesday")){
		 System.out.println("weekday  " +a);
		  }
	 else if (a.equals("wednsday")){
		 System.out.println("weekday  " +a);
		  }
	 else if (a.equals("thursday")){
		 System.out.println("weekday  "+a);
		  }
	 else if (a.equals("friday")){
		 System.out.println("weekday " +a);
		  }
	
	else  {
		 System.out.println("weekend   "  +a);
	 }
	}

}
