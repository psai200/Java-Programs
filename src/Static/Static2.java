package Static;

import java.util.Scanner;

public class Static2 {
	static int a ;
	static {
	Scanner obj=new Scanner(System.in);
	System.out.print("enter a:");
	 a = obj.nextInt();
	}
	static void display() {
		System.out.println("value a:"+a);
		
	}
	 
	static void display(String hara) {
		System.out.println("name "+  hara);
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Static2.display();
			Scanner h = new Scanner(System.in);
			System.out.println("enter name:");
			String g =h. next();
			Static2.display(g);
			
			

	

	}

}
