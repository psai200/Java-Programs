package Strings;

public class Hari {
	Hari(){
		System.out.println("constructor ");
	}
	Hari(int a,int b){
		System.out.println("a+b="+a + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hari obj = new Hari();
		Hari obj1 = new Hari(10,20);

	}

}
