package programsOnNumber;

public class PrimeNumber {

	public static void main(String[] args) {
		
		
		int num =6 ;
		
		for(int i=1;i<=100;i++) {
			
			if(PrimeNumber.isPrime(i)) {
				System.out.print(i +",");
			}
			
		}
		
		
		
		//System.out.println(PrimeNumber.isPrime(6));
	
		
		

	}
	
	
	
	
	public static boolean isPrime(int num) {
		
		int count =0;
		
		for(int i=1;i<=num;i++) { if(num%i == 0) {count++;} }
		
		if(count == 2) {return true;}else {return false;}
		
	}
	

}
