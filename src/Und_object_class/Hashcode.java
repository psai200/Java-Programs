package Und_object_class;

public class Hashcode {
	void meth1() {
		System.out.println("meth1()called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Hashcode o= new Hashcode();
			Hashcode o1= new Hashcode();
			Hashcode o2= new Hashcode();
			Hashcode o3= new Hashcode();
			System.out.println("obj hascode   "+o.hashCode());
			System.out.println("obj1 hascode   "+o1.hashCode());
			System.out.println("obj2 hascode   "+o.hashCode());
			System.out.println("obj3 hascode   "+o3.hashCode());
			
	}

}
	