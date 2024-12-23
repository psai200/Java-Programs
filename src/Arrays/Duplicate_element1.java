package Arrays;

public class Duplicate_element1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,6,8,4,5,9,7,5,8,2,};
		for(int i=0;i<arr.length;i++) {
		 for (int j=i+1;j<arr.length;j++) {
			 if(arr[i]==arr[j]) {
				 System.out.println(arr[i]);
				 
				 break;
			 }	 
		}
		 }
	}

}
