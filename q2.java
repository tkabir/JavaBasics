import java.util.Scanner;


public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter two integers: ");
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.print(a+", "+b+", ");
		for(int i=1; i<13; i++){
			int c = a + b;
			System.out.print(c+", ");
			a = b;
			b = c;
			
		}
	}

}
