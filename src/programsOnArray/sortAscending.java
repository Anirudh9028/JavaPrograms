package programsOnArray;

public class sortAscending {

	public static void main(String[] args) {
		
		int num [] = {23,45,12,34,12,45};
		
		
		int temp ;
		
		for(int i=0;i<num.length;i++ ) {
			
			
			for(int j=i+1;j<num.length;j++) {
				
				if(num[i]>num[j]) {
					
					temp= num[i];
					num[i] =num[j];
					num[j]= temp;
					
				}
			}
			
			
		}
		
		System.out.println("Aescending ");
		for(int yu : num) {
			
			System.out.print(yu +",");
			
			
			
		}
		
		
		
	
		
		
	}

}
