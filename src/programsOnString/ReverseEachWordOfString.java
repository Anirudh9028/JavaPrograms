package programsOnString;

public class ReverseEachWordOfString {

	public static void main(String[] args) 
	{
		
		
		String sen = "Java is great and fun";
		
		String con [] = sen.toLowerCase().split(" ");
		
	
		String rev = "";
	
		
		for(String hj : con) {
			
			String zx = hj;
			String revWord = "";
			
			for(int i = zx.length()-1;i>=0;i--) {
				
				revWord = revWord + zx.charAt(i);
				
			}
			
			rev = rev + revWord +" ";
		}
	
		
		System.out.println(rev);
		
	}

}
