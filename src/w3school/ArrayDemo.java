package w3school;

public class ArrayDemo {

	public static void main(String[] args) {
	
		int []mynum= {10,30,40,60,80,90};
		System.out.println(mynum[2]);
		
		mynum[2]=100;
		System.out.println(mynum[2]);
		
		System.out.println(mynum.length);
		
		for(int i=0; i<mynum.length; i++) {
			System.out.println(mynum[i]);
		}
		
		for(int i: mynum) {
			System.out.println(i);
		}

	}

}
