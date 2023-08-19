package liveExamples;

import java.util.Scanner;

public class VotingExamplebyScanner {

	public static void main(String[] args) {
		
		int age;
		System.out.println("Enter your Age");
		Scanner r=new Scanner(System.in);
		age= r.nextInt();
		
		if(age>=20) {
			
			System.out.println(" You are elegibale for voting");
		}else {
			System.out.println(" Check your elegibilty fir next term");
		}
		


	}

}
