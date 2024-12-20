           package Strings;

public class Student {
	String name;
	int rollno;
	Student(){
		name ="hara";
		rollno=63;
	}
	Student(String a,int no){
		name=a;
		rollno=no;
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		Student s1=new Student("hari",62);
		System.out.println(s.name);
		  System.out.println(s.rollno);
		System.out.println(s1.name);
		System.out.println(s1.rollno);

	}

}
