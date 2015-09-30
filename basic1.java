import java.util.Scanner;
//Java program to print a square of stars for given input number

public class basic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("\nPlease enter a number: ");
		int num = in.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
