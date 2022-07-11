package packageofques2;

import java.util.HashMap;

public class main {
		
		public static void main (String[] args) {
			
			ques2 bb= new ques2();
			var x =bb.sizeDenom();
			
			var y =bb.valuesOfArray(null , x);

			var z =bb.totalAmount();
			
			var ans = bb.findMin(y, x, z) ;
			
			System.out.println("Your payment approach in order to give min no of notes will be"
					);
			
			 
			 HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
			 
			for(int i=0;i<x;i++)
			{
				hm.put(y[i], 0);
				
			}
			for(int i=0;i<ans.size();i++)
			{	
				var currentcount = hm.get(ans.get(i));
				hm.replace(ans.get(i), currentcount+1);
			}
			for(int i=0;i<x;i++)
			{
				var key = y[i];
				var count = hm.get(key);
				if(count>0) {
					System.out.println(key+":"+ count);
				}
				
			}
			
		
		}

}
