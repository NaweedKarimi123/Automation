package logical_operators;

public class Boolean_Logics {

	public static void main(String[] args) {
		boolean b1= true&& true;
		boolean b2= b1 && false;
		boolean b3=!true;
		
		System.out.println(b3);
		
		int n=8;
		if(n>=5 && n<10) {
			System.out.println("This number is between 5 and 10");
		}else
		{System.out.println("this number is out of range");}
		
		
		System.out.println("-----------");
		
		
		
		
		
		int boy, girl;
		boy=10;
		girl=60;
		
		if( boy >=10 || girl <=40) {
			System.out.println("you can enter ");
		}else {
			System.out.println("You can not enter");
		}
		
		int age=28;
		int legalAgeforDriving=20;
		if(age>=legalAgeforDriving) {
			System.out.println("you Can drive");
		}else {
			System.out.println(" please try nexr year");
		}
		
		boolean IlovemyMom=true;
		if(true) {
			System.out.println("your Mom love you too");
			System.out.println("your Mom love you to");
		}
		
		
		
		
		int x=20;
		int y=20;
		if(x>y) {
			System.out.println("The Max is x:"+x);
		}
		if(y>x) {
			System.out.println("The Max is y:"+y);
		}
		if (x==y) {
			System.out.println(" you win the game");
			
		}
		
		System.out.println("-----------------------");
		
//		Bank example
		
		double Balance=5555;
		double Amountwithdraw=10000;
		if(Amountwithdraw <=Balance) {
			
			System.out.println(" Give Amount to user:$ ");
			System.out.println("Balance");
			Balance-=Amountwithdraw;
		
		}else {
			System.out.println("No amount in your account");
		}
		
		

	}
	
	
}
