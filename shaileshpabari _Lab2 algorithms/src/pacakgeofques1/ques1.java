package pacakgeofques1;

import java.util.List;
import java.util.Scanner;

public class ques1 {

	public static int  sizeArray () {
		
		System.out.println("Enter the size of transaction array");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}
	
	public static int []  valuesOfArray  ( int [] brr , int a ) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the values of array");
		
		int [] brr1 = new int [a];
		
		for(int i=0;i<a;i++) {
			
			brr1[i]=sc1.nextInt();
		}
		return brr1;
		
	}

	public static int  numberOfTargets () {
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		Scanner sc2 = new Scanner(System.in);
		int input2 = sc2.nextInt();
		return input2;
	}
		
	public static int  valueOfTarget () {
		
		System.out.println("Enter the value of target");
		Scanner sc3 = new Scanner(System.in);
		int input3 = sc3.nextInt();
		return input3;
				
	}
	

	public static int booleanTransactions (int [] arr, int arrSize, int target) {
		
		int current=0;
		
		for(int i=0;i<arrSize;i++)
		{
			current= current+arr[i];
			
			if(current>=target)
			{
				return i+1;
			}
		}
		return -1;
				
	}
	
	
}
