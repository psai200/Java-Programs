package Datatypes.java;

public class Ternaryoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a short hand for if else conditional operator
		int i= 10;
		int  j= 5;
		int  d= i>j? i:j;
		System.out.println(d);
		 //
		int a = 5, b = 10, c = 15;
		int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

		System.out.println(" value : " + max); 

	}

}
