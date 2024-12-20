package Methods;

public class Demo {
	void meth() {
		System.out.println(10);
		System.out.println(20);
	}
	int  meth1() {
	System.out.println("call meth");
	return 100;
	}
	void meth2(int a) {
		if(a>20) {
			System.out.println("a is gratter");
		}
		else {
			System.out.println("a is less");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj= new Demo();
		obj.meth();
		System.out.println(obj.meth1());
		obj.meth2(30);

	}

}
