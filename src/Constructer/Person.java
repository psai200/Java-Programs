package Constructer;
  
public class Person {
	String name;
	int id;
	Person(String str , int a){
		name=str;
		id =a;
	}
	void display() {
		System.out.println("name  "+name);
		System.out.println("id  "+id);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person s= new Person("balu",4);
		Person s1 = new Person("hari",5);
		s.display();
		s1.display();
		
	}
}