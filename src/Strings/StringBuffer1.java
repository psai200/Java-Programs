package Strings;

public class StringBuffer1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer("welcome");
       System.out.println(s);//wel
       s.append("java");
       System.out.println(s);//w j
       s.insert(0,"hi");
       System.out.println(s);//h w j
       s.delete(9,13);
       System.out.println(s);//hw
       s.length();
       System.out.println(s);
       s.reverse();
       System.out.println(s);
       s.replace(9, 14, "sayukth");
       System.out.println(s);
     s.length();
      System.out.println(s);//14
       
       
	}

	

}
