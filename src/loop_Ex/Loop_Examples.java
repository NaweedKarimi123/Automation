

package loop_Ex;

import java.util.Scanner;

public class Loop_Examples {

	public static void main(String[] args) {
		
	for (int i=0; i<=10; i++) {
		System.out.println(i);
	}
	
	
	int sum=0;
	for (int i=0; i<=10; i++) {
		sum+=i;
	
	}{System.out.println("sum:"+sum);}
	
		
		int sum1=0;
		for (int i=230; i>=100; i--) {
			sum1=sum1+i;
		}
		{System.out.println("sum: "+sum);}
		
		for (int i=40; i<=50; i++) {
			if(i%2==1)
			System.out.println("her is the number:"+i);
		}
		
	for (int i=0; i<=5; i++) {
		System.out.println(i++);
	}
	
	for (int i=1; i<5; i++) {
		for (int j=1; j<10; j++);
		System.out.print("*");
		
		System.out.println();
			
	}
	
	System.out.println("-------------");
	
	
	int a=0;
	while(a<=10) {
		System.out.println(" a is less than 10:"+a);
		a++;
		if(a==8)
		break;
	}
	
//	The while loop repeatedly executes the same set of 
//	instructions while its controlling expression is true. Here is an example :
	
	int count=0;
	while(count<=10) {
		System.out.print("count:"+count);
		if(count==5)
			break;
		count++;
	}

	System.out.println("---------------------");
	
	int i;
	int sum2;
	for (i=0, sum2=1; i<10; i++)
		System.out.println("This is the value: " +i);
	sum2=sum2+i;
	System.out.println("This is the Sum"+sum);
	
	
	
	
	
		
	}
	

}
