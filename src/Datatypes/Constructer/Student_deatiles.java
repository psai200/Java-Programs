package Constructer;

public class Student_deatiles {
	String name;
	int id;
	Student_deatiles(){
		name="hari";
		id= 22;
		
	}
	Student_deatiles(String a,int b){
		a= name;
		b=id;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_deatiles d=new Student_deatiles();
		Student_deatiles e = new Student_deatiles("john" ,24);
		System.out.println(d.name);
		System.out.println(d.id);
		System.out.println(e.name);
		System.out.println(e.id);

	}

}
