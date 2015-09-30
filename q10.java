import java.util.Scanner;
import java.util.StringTokenizer;
//Enter a 4-digit number and display the sum of the 1st and last digit

public class q10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("\nPlease enter a 4-digit number: ");
		int num = in.nextInt();
		String s = Integer.toString(num);
		int sum = 0;
		
		int[] arr = new int[s.length()];
		for(int i=0; i<s.length(); i++){
			arr[i] = s.charAt(i) - '0';
			
		}
		
		sum = arr[0] + arr[s.length()-1];
		System.out.println(sum);
		
		//StringTokenizer st = new StringTokenizer(s);
	}
}
