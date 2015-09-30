import java.util.Scanner;
//convert distance entered in km to m,f,inch,cm

public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float d;
		Scanner in = new Scanner(System.in);
		System.out.println("\nPlease enter distance in km: ");
		d = in.nextFloat();
		
		double m = Math.floor(d) * 1000;
		System.out.print((int)m+" meters, ");
		
		double f = (d*1000-m)*3.28;
		//System.out.println(d*1000-m);
		System.out.print((int)f+" feet, ");
		
		double i = f * 12;
		System.out.print((int)i+" inches, ");
		
		double cm = i * 2.54;
		System.out.print(cm+" cm.");
		

	}

}
