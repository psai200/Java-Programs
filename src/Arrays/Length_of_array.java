package Arrays;

public class Length_of_array {
	void num() {
		
		int arr1[]=new int[4];
		 int arr2[]=new int [5];
		int arr3[]= {10,20,30,40,50};
		 int arr4[]= {11,12,13,14,25};
		 String s="sai"; 
		 System.out.println("Array length : "+arr1. length);
		 System.out.println("String length : "+s.length());
		 arr2[2]=354;
		 System.out.println(arr2[2]);
		 System.out.println(arr3[arr3.length-5]);
		 for(int i=0;i<arr4.length;i++) {
			 System.out.println(arr4[i]);
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new  Length_of_array().num();
	}

}
