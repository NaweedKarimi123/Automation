package CalulatorwithScanner;

import java.util.Scanner;

public class Calculator_examples {

	public static void main(String[] args) {
		
		Scanner cal =new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter the firstNum");
		fnum=cal.nextDouble();
		System.out.println("Enter the SecondNumber");
		snum=cal.nextDouble();
		answer=fnum+snum;
		answer=fnum-snum;
		answer=fnum*snum;
		answer=fnum/snum;
		System.out.println(answer);
		

	}

}
