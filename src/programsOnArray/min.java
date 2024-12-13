package programsOnArray;

public class min {

	public static void main(String[] args) {
		int as[] = {12,34,56,34,12,56,100};
		
		int min = as[0];
		
		
		for(int ty : as) {
			
			if(min>ty) {
				
				min = ty;
			}
		}
		
		System.out.println("Min = " + min);
		

	}

}
