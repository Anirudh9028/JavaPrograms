package programsOnArray;

public class duplicate {

	public static void main(String[] args) {
		
		
		int qw [] = {12,34,56,78,90};
		boolean flag =false;
		
		
		for(int i=0;i<qw.length;i++) {
			for(int j=i+1;j<qw.length;j++) {
				
				if(qw[i]==qw[j]) {
					
					System.out.println(qw[i]);
					flag = true;
					
					
				}
				
				
				
			}}
		
		if(flag == false) {System.out.println("no duplicates");}
		

	}

}
