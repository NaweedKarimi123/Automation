package interviewQ;

public class ArrayQ {

	public static void main(String[]args) {
		
//		Finding largest number in Array
		
		int[] arr= {20,40,500,600,700,750,6666};
		
		int MaxNumbre=arr[0];  //assum array of 0 is maxNumner\
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<MaxNumbre) {
				MaxNumbre=arr[i];
			}
		}
		System.out.println(MaxNumbre);
		
		
	}

}
