package loop_Ex;

public class Loop_ex {

	public static void main(String[] args) {
		
	for(int i=1; i<50; i++) {
		if(i%3==0 && i%5==0) {
			System.out.println("FINRA"+i);
		}else if(i%3==0) {
			System.out.println("FIN");
		}else if(i%5==0) {
			System.out.println("APRA");
		}else {
			System.out.println(i);
		}
	}

	}

}
