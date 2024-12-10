package Strings;

public class Demo1 {
	private String name;
	private int age;
	public  String getname() {
		return name;
		
	}
	public void setname(String name) {
		this.name=name;
	}
	public int age() {
		return age;
	}
	public void setage(int age) {
		if(age>0) {
			this.age =age;
		}
		else {
			System.out.println(" age will positive");
		}
	}
	

}
