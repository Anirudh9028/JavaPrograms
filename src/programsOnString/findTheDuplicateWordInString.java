package programsOnString;

import java.util.HashMap;
import java.util.Map;

public class findTheDuplicateWordInString {

	public static void main(String[] args) {
	
		String qw = "java Java python ruby Ruby";
		String vb = qw.toLowerCase();
		String as [] = vb.split(" ");
		
		Map<String ,Integer> kl = new HashMap<String , Integer>();
		
		for(String jk : as) {
			
			if(kl.containsKey(jk)) {
				
				kl.put(jk, kl.get(jk)+1);
			}
			else {kl.put(jk, 1);}	
		}
		
		for(String df : kl.keySet()) {
			
			
			if(kl.get(df)>1){
				
				System.out.println(df +" = "+ kl.get(df));
			}
			
		}
		
		
		
		
		
		
	}

}
