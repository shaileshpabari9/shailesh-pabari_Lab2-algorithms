package pacakgeofques1;

public class main1 {
	
	public static void main (String[] args) {
		
		ques1 bb= new ques1();
		var x =bb.sizeArray();
		
		var y =bb.valuesOfArray(null , x);

		var z =bb.numberOfTargets();
		
		for(int i=0;i<z;i++)
		{
			var p = bb.valueOfTarget();
			var ans = bb.booleanTransactions(y, x, p);
			if(ans!=-1) {
				System.out.println("Target achieved after " + ans + " transactions");
			}
			else {
				System.out.println("target is not achieved");
			}
		}
		
		
				
	}

}
