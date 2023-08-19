package week1;

public class Reversed {

	public static void main(String[] args) {


		String str="Hello dear";
		String rstr="";
		char ch;
		
		for( int i=0; i<str.length(); i++) {
			ch =str.charAt(i);
			rstr=ch+rstr;
			
		}
		System.out.println(rstr);
		
		

	}

}
