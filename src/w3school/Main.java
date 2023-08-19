package w3school;

public class Main {
	
	 static void mythod(String name, int age) {
		 System.out.println(name+age);
	 }
	 
	 static void chechAge(int age) {
		 System.out.println(age);
		 if(age<20) {
			 System.out.println(" You are under age");
		 }else {
			 System.out.println("you can access");
		 }
	 }
	 
	 
	 public static void main(String[]arg) {
		 Main main=new Main();
		 main.mythod("Naweed", 20);
		 main.mythod("Haji Ibarhim", 10);
		 main.mythod("Haji Amir", 5);
		 main.mythod("Bibi", 20);
		 
		main.chechAge(15);
		main.chechAge(25);
	 }
	
	

}
