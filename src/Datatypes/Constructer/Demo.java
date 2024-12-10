package Constructer;

import java.util.Scanner;

public class Demo {
	String name;//variable declaration
	int b;
	Demo(String a,int c){// crate  method
		name = a;
		b=c;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner obj =new Scanner(System.in);
			System.out.println("enter name:");
			String name = obj.next();
			System.out.println("enter b:");
			int  b = obj .nextInt();
			Demo s = new Demo(name,b);// object creation
			System.out.println (s.name);
			System.out.println(s.b);
			
	}

}
