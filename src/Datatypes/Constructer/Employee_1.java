package Constructer;

import java.util.Scanner;

public class Employee_1 {
	private String name;
	private  int id;
	private  double salary ; 
	public Employee_1 (String name,int id,double salary) {
		this.name=name;
		this.id=id;
		this.salary= salary;
	}
	public void  display() {
		System.out.println("enter Employee details ");
		System.out.println("name" +name);
		System.out.println("id" +id);
		System.out.println("salary" +salary);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj =new Scanner(System.in);
		System.out.println("enter name:");
		String a = obj.next();
		System.out.println("enter id:");
		int b = obj.nextInt();
		System.out.println("enter salary:");
		double c = obj.nextDouble();
		Employee_1 str = new Employee_1(a, b, c);
		str.display();
	}

}
