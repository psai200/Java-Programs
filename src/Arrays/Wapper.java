package Arrays;

public class Wapper {
	void meth1() {
		int i=50;
		Integer ival=Integer.valueOf(i);
		System.out.println("pdt value==>"+i);
		System.out.println("woc value==>"+ival);
		long l=100;
		Long lval=Long.valueOf(l);
		System.out.println("long pdt value==>"+l);
		System.out.println("long wco value==>"+lval);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Wapper().meth1();

	}

}

