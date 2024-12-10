package java_progrms;


public class VowelandConsonant {
   /* public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}*/
	
	    public static void main(String[] args) {
	        outerLoop:
	        for (int i = 1; i <= 5; i++) {
	            for (int j = 1; j <= 5; j++) {
	                if (i * j == 7) {
	                    break outerLoop; // breaks the outer loop
	                }
	                System.out.println(i + j);
	            }
	        }
	    }
	}

