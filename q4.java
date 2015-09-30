import java.util.Random;


public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[18];
		int sum = 0, min = 1;
		Random rand = new Random();
		for(int i=0; i<15; i++){
			int rnum = rand.nextInt(10-1+1)+1;
			arr[i] = rnum;
			sum = sum + arr[i];
			if(min > arr[i]){
				arr[i] = min;
			}
		}
		
		arr[15] = sum;
		arr[16] = sum/18;
		arr[17] = min;
		
		for(int i=0; i<18; i++){
			System.out.print(arr[i]+" ");
		}
		
		

	}

}
