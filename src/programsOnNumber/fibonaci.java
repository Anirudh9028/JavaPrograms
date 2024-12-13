package programsOnNumber;

public class fibonaci {

	public static void main(String[] args) {
		
		
		int num = 8;
		int first = 0;
		int second =1;
		
		//System.out.print(first +" , "+second +" , ");
		
		for(int i =2;i<=num;i++) {
			
			System.out.print(first+",");
			
			int third = first + second;
			first =second;
			second =third; 
			
			
		}
	}

}
