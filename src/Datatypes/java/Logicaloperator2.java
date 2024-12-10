package Datatypes.java;



public class Logicaloperator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =10, c= 10 ,d=61;
		int b= 5;
		boolean  h= (a>b&&c<d);
		System.out.println (h);
		//
		boolean k =(a<d||b<c);
		boolean j =(a==b ||c<d);  
		System.out.println (k);
		System.out.println (j);
		//
		boolean i =!(a>b);
		System.out.println (i);
		//
		boolean l=(a<d^b>c); 
	boolean r =(a==b ^c>d);  
	System.out.println (l);
		System.out.println (r);

	}

}
