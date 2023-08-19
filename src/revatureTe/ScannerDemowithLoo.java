package revatureTe;

import java.util.Scanner;

public class ScannerDemowithLoo {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		String []cars= {"Toyota","Camery","BMW","Audi","Lada"};
	
		boolean loopswtich=true;
		do{
			for (int i=0; i<cars.length; i++) {
				System.out.println(i+1+": )"+ cars[i]);
			}
			String selection = scanner.nextLine();
			
			switch(selection) {
			case "1":
				System.out.println("Toyota");
				break;
			case "2":
				System.out.println("Camery");
				break;
			case "3":
				System.out.println("BMW");
				break;
			case "4":
				System.out.println("Audi");
				break;
			case "5":
				System.out.println("Lada");
				break;
			default:
				System.out.println(" Youd did not select good option");
				
			}
			
		} while(loopswtich);
	

	}
}
