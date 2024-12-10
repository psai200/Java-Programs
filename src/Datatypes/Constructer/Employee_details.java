package Constructer;

import java.util.Scanner;

public class Employee_details {
	 String name;
	  String id;
	 double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employe_details s=new Employe_details();
       Scanner obj = new Scanner(System.in);
       Employee_details s=new Employee_details();
       System.out.println("enter name");
       s.setName(obj.nextLine());
       System.out.println("enter id");
      s.setId(obj.nextLine());
       System.out.println("enter salary");
     s.setSalary(obj.nextDouble());
     //Employe_details s=new Employe_details();
     
      System.out.println("emp salary"+s.getSalary());
      System.out.println("emp id"+s.getId());
      System.out.println("emp name"+s.getName());
       
	}

}
