package Und_object_class;

public class Equal {
	void method() {
		System.out.println("method() called");
		
	}

	public static void main(String[] args) {
		
		Equal a= new Equal();
		Equal a1= new Equal();
		Equal a2= new Equal();
		System.out.println(a.equals(a));
		System.out.println(a.equals(a1));
		System.out.println(a1.equals(a1));
		System.out.println(a2.equals(a2));
	}

}
