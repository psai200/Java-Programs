package Arrays;

public class Addition_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr1[][]= {{1,2,3},{4,6,8}};
		 int arr2[][]= {{14,13,12},{4,7,9}};
		 int arr3[][]= new int[3][3];
		 for(int i =0 ;i<3;i++) {
			for(int j=0;j<3;j++) { 
				  arr3[i][j]=arr1[i][j]+arr2[i][j];  
			   System.out.println(arr3[i][j]+" ");
		 
			}
		 }
		 


	}

}