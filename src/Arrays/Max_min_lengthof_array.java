package Arrays;

public class Max_min_lengthof_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr1= {1,2,3,40,5,600,7,8,9,10};
		int min=0;
		int max = 0;
		for(int i=1;i<arr1.length;i++) {
			
			if(arr1[i]< min) {
				min=arr1[i];
			}
			if(arr1[i]>max) {
			max=arr1[i];
		}
		}
		System.out.println("minimum"  +min);
		System.out.println("maximum"  +max );	
		

	}


}