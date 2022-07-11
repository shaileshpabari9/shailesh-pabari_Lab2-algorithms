package packageofques2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;


public class ques2 {
	
	public static int  sizeDenom () {
		
		System.out.println("Enter the size of currency denominations");
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
	
	public static int  totalAmount () {
		
		System.out.println("Enter the amount you want to pay");
		Scanner sc2 = new Scanner(System.in);
		int input2 = sc2.nextInt();
		return input2;
	}
	
    public static List<Integer>  findMin( int [] deno, int n, int amount)
			    {
			        // Initialize result
    				Arrays.sort(deno);
			        Vector<Integer> ans = new Vector<>();
			        List<Integer> p =new ArrayList<Integer>();
			  
			        // Traverse through all denomination 
			        for (int i = n - 1; i >= 0; i--)
			        {
			            // Find denominations 
			            while (amount >= deno[i]) 
			            {
			                amount -= deno[i];
			                ans.add(deno[i]);
			            }
			        }
			  
			        // Print result 
			        for (int i = 0; i < ans.size(); i++)
			        {
			            p.add(ans.elementAt(i));
			        }
					return p; 
			    }
	
}
