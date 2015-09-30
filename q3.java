import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
//Enter two numbers and search in random array 

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = new int[5];
		Random rand = new Random();
		for(int i=0; i<5; i++){
			int rnum = rand.nextInt(40-1+1)+1;
			arr[i] = rnum;
			System.out.print(arr[i]+", ");
		}
		
		Scanner in = new Scanner(System.in);
		System.out.println("\nPlease enter two integers: ");
		int a = in.nextInt();
		int b = in.nextInt();
		
		boolean bingo;
		int flag=0;
		for(int i=0; i<5; i++){
			if(arr[i] == a){
				flag++;
				break;
			}
		}
		for(int i=0; i<5; i++){
			if(arr[i] == b){
				flag++;
				break;
			}
		}
		if(flag == 2){
			System.out.println("Bingo!");
		}else{
			System.out.println("Not Found");
		}
		//System.out.println(al.size());
		
	}

}
