package Constructer;

public class Demo11 {
	public Demo11() {
		System.out.println("mon");
		Demo11 obj =new Demo11(20);
		System.out.println("tues");
		String s=obj.display("chalange");
		System.out.println(s);
	}
	public Demo11(int t) {
	System.out.println("sat");
	new Demo11(20,30);
	System.out.println("wen");
	}
	String display(String s) {
		System.out.println ("m n j h ");
		return s; 
	} 
	public Demo11(int data,int temp) {
		System.out.println("thursday");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo11 obj= new Demo11();
		System.out.println("opt ver");
	}

}
