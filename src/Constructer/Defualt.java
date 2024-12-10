package Constructer;

import java.util.Scanner;

public class Defualt {
	
	    String name;
	    int age;

	     
	    Defualt(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	    void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter name: ");
		        String name = scanner.nextLine();
		        System.out.print("Enter age: ");
		        int age = scanner.nextInt();
		        Defualt n = new Defualt (name, age);
		        System.out.println("Person Details:");
		      n.displayInfo();
		    }
		


	}


