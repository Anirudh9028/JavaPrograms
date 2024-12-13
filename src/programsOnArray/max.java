package programsOnArray;

public class max {

	public static void main(String[] args) {
		int as[] = {12,34,56,34,12,56,100};
		
		int max = as[0];
		
		
		for(int ty : as) {
			
			if(max<ty) {
				
				max = ty;
			}
		}
		
		System.out.println(max);
		

	}

}
