package w3school;

public class SimpleHello {
	
	public static void main(String[]arg) {
//		single line beofor comment 
		System.out.println("Hello welcome to Java");
//		single line afger code comment
		
		/*for multi line code we use this tips*/
		
//		create a variable and assign on it:
		String color="blue";
		System.out.println("The color of is:"+ color);
		
//		create a int and assign 
		int mynum=20;
		System.out.println(mynum);
		
//		create a variable and then assign
		String phonetype;
		phonetype="iphone";
		
		System.out.println(phonetype);
		
		phonetype="samsung";
		System.out.println(phonetype);
		
//		create a final variable that we can not change the variable 
		final int mynumber=10;
		System.out.println(mynumber);
		
//		here we try to assgin on final variable but we get error
//		mynumber=200;
		
//		combine text and variabl together:
		
		String country ="Afghanisan";
		System.out.println("One of the contries which stats with A :" + country);
		
//		adding one variable to other variable 
		
		String firstname="Haji Amir ";
		String lastName="Karimi";
		String fullName=firstname+lastName;
		System.out.println("fullName is :)" + firstname);
		
		int x=20, y=30, z=40;
		System.out.println("The result of X+Y+Z is :"+ (x+y+z));
		
		
		
		
		
		
	}

}
