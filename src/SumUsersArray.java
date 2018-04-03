//Maurice Hanns CSC 242 04/03/2018

import java.util.Scanner;

public class SumUsersArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] value1 = new int[3];
		int [] value2 = new int[3];		
		int [] Sums = new int[3];

		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < value1.length; i++){
			
			System.out.println("Please, enter Array 1 number <" + (i+1)  + ">. ");
			value1[i] = input.nextInt();
			
			System.out.println("Please, enter Array 2 number <" + (i+1)  + ">. ");
			value2[i] = input.nextInt();		
		
		}//for loop
		
		for (int i = 0; i < value1.length; i++){
			Sums[i] = value1[i] + value2[i];
			System.out.println(Sums[i]);
		}//for loop
				
			
	}//main
				
}//SumUsersArrays