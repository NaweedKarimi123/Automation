package w3school;

public class SwitchDemo {

	public static void main(String[] args) {
		
		
		int day=2;
		
		switch (day) {
		case 1: 
			System.out.println(" This is saturday");
		break;
		case 2:
			System.out.println("This is Sunday");
			break;
			case 3:
				System.out.println("This is Tuesday");
				break;
				
			default:
				System.out.println("other days of the week");
				
		}
		char Char='M';
		switch(Char) {
		case 'A': 
			System.out.println(" This is A");
			break;
		case 'B': 
			System.out.println("This is B");
			break;
		case 'C': 
			System.out.println(" This is C");
			break;
		case 'D':
			System.out.println(" This is D");
			default:
				System.out.println(" This is other letter");
		}


	}
}
