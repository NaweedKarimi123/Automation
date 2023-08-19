package logical_operators;

public class SwichCase_Examples {

	public static void main(String[] args) {
		
		String day="Mon";
		switch (day) {
		case "SAT":
			System.out.println("This is Saturday");
			break;
		case"SUN":
			System.out.println("This is Sunday");
			break;
		case"Mon":
			System.out.println("This is monday");
			break;
			default:
				System.err.println("other days of the week");
		}
				
		System.out.println("------------------------------");
		
		
		int n=10;
		switch (n) {
		case 10:
			System.out.println("this is number 10");
			break;
			
		case 4:
			System.out.println("this is number 4");
			break;
		case 5:
			System.out.println("this is numbe 5");
			break;
			default:
				System.out.println("this is other number");
				
			
		}
		
		
		

	}

}
