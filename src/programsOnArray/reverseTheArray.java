package programsOnArray;

public class reverseTheArray {

	public static void main(String[] args) {
		
		
		int qw [] = {12,34,56,78,90};
		
		
		int lft = 0;
		int right = qw.length-1;
		
		while(lft<right) {
			
			
			int temp = qw[lft];
			qw[lft] = qw[right];
			qw[right]= temp;
			
			
			
			lft++;
			right--;
		}
		
		for(int we : qw) {System.out.println(we);}

	}

}
