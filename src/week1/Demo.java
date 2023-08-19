package week1;


public class Demo {
	
	public static void main(String[] args) {
		
		
		String str="Afghanistan";
		char[]sc=str.toCharArray();
		int size=sc.length;
		
		String reversed="";
		
		for (int i=size-1; i>=0; i--) {
			reversed=reversed+sc[i];
		}
	
		
	}

}
