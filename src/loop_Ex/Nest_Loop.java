package loop_Ex;

import java.util.Scanner;

public class Nest_Loop {

	public static void main(String[] args) {
		
	for(int i=1; i<=4;i++) {
		for(int j=1; j<=4; j++);{
			System.out.println("*");
		}
			System.out.println();
	
	}
	
	System.out.println("------------");
	
	int week=3;
	int days=7;
	for(int i=1; i<=week; i++) {
		System.out.println(" This is week:"+i);
		for (int j=1; j<days; j++) {
			System.out.println("This is day"+j);
		}
	}
	
	int rows=10;
	for (int i=1; i<=rows; i++) {
		for(int j=1; j<i; j++) {
			System.out.print(j+" ");
		}
		System.out.println();
		
		System.out.println("------------");
	}
	
			for(int i=1; i<=3; i++) {
				for(int j=1; j<=2; j++) {
					System.out.println(i+" "+j);
				}
			}
	

	}

}
