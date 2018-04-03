//Maurice Hanns CSC 242 04/03/2018

public class SumArrays {

	public static void main(String[] args) {
			// TODO Auto-generated method stub

		int [] value1 = {30,26,2,13};
		int [] value2 = {3,21,64,1,};		
		int [] Sums = new int[4];
			
		for (int i = 0; i < value1.length; i++){
			Sums[i] = value1[i] + value2[i];
			System.out.println(Sums[i]);
		}//for loop
			
		
	}//main
			
}//SumArrays