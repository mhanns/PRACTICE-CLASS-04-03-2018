
public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [][] value1 = {{30,26,2,13},
						   {3,21,64,1,},
						   {39,89,55,4}};
		
		int [][] value2 = {{35,29,62,93},
				   			{73,24,54,81,},
				   			{45,78,1,43}};
		int [][] sum = new int[3][4];
		
		
		for (int i = 0; i < value1.length; i++) {
			for (int j = 0; j < value1[0].length; j++) {
				
				sum[i][j] = value1[i][j] + value2[i][j]; 
		    
		}//outer for loop
			
			}//inner for loop
		
	for (int i = 0; i < sum.length; i++) {
		for (int j = 0; j < sum[i].length; j++) {
			System.out.print(sum[i][j] + "\t|"); 	
		}		
			System.out.println(); 
		}		
	}//main

}//class
