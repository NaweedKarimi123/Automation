package w3school;

public class StrDemo {

	public static void main(String[] args) {
		
		String name="Afghanistan is my homeland";
		String str="My Country";
//		int lenghtOfString=name.length();
//		System.out.println(lenghtOfString);
		System.out.println(name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.concat(str));
		System.out.println(name.contains(str));
		System.out.println(name.indexOf(5));
		System.out.println(name.isBlank());
		System.out.println(name.substring(0,6));
		
		System.out.println(Math.max(20, 10));
		System.out.println(Math.min(20, 10));
		System.out.println(Math.sqrt(16));
		System.out.println(Math.max(20, 10));

		boolean skyisblue=true;
		System.out.println(skyisblue);
		
		int x=200;
		int y=24;
		if(x<y && y<30) {
			System.out.println(" you are lucky ");
		}else if(x<y && y<20) {
			System.out.println("try next time ");
		}else {
			System.out.println(" you are not winner");
			
			double mydouble =220.5;
			System.out.println(mydouble == 220.5); 
			
			
			
		}
	}

}
