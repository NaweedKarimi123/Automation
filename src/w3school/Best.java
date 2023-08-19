package w3school;

class Best{
	int x=5;
	String FirstName="Naweed";
	String LastName="Karimi";
	int Age=20;
	
	public static void main(String[]arg) {
		Best best=new Best();
		
		Best best2=new Best();
		
		System.out.println(best.x);
		System.out.println(best.x);
		best.x=20;
		System.out.println(best.x);
		
		System.out.println(best.FirstName+" "+best.LastName);
		System.out.println(best.LastName);
		System.out.println(best.Age);
	}
	
}
