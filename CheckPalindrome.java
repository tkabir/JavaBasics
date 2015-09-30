import java.util.Scanner;
//Java program to check whether a string is palindrome 

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("\nPlease enter a string: ");
		String str = in.nextLine();
		String sp = str.toLowerCase().trim().replaceAll("\\s+", "");
		String s = sp.replaceAll("\\p{Punct}+", "");
		
		boolean isPal = false;
		for(int i=0; i<s.length()/2; i++) {
			if(s.length()%2 == 0) {
				if(s.charAt(i) == s.charAt(s.length()-1-i)) {
					isPal = true;
				} else isPal = false;
			}else if(s.length()%2 == 1) {
				
				//if(i == (s.length()-1)/2) break;
				if(s.charAt(i) == s.charAt(s.length()-1-i)) {
					isPal = true;
				} else isPal = false;
			}
		}
		
		if(isPal == true) {
			System.out.println(s+" is a palindrome");
		} else System.out.println(s+" is not a palindrome");

	}

}
