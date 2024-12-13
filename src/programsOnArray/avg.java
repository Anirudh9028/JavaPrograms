package programsOnArray;

public class avg {

	public static void main(String[] args) {
		
		
		
		int as[] = {12,45,78,96,56,74,55};
		
	
		int sum =0;
		int len = as.length;
		
		for(int op : as) {
			
			sum = sum + op;
			
		}
	
	System.out.println(sum/len);
	
	
	}

}
