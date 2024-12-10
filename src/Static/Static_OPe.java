package Static;

public class Static_OPe {
	static int a=1;
	int b=0;
	Static_OPe() {
	a++;
	b++; 
	System.out.println("Static:"+a);
	System.out.println("instance:"+b);
	System.out.println("------");
	}
	void display() {
	System.out.println("** Accessing static**");
	System.out.println(Static_OPe.a );
	System.out.println(a);
	System.out.println(new Static_OPe ().a );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Static_OPe ();
		new Static_OPe ();
		System.out.println("######");
		new Static_OPe ().display();
	}

}
