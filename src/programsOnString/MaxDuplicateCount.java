package programsOnString;

import java.util.HashMap;
import java.util.Map;
/*
 find max of duplicate character count 
 
 */
public class MaxDuplicateCount {

	public static void main(String[] args) {
		
		String gh = "klnmjkkl";
		String ui = gh.toLowerCase();
		char dup [] = ui.toCharArray();
		
		Map<Character ,Integer> mp = new HashMap<Character, Integer>();
		
	for(char qw : dup) {
		
		
		if(mp.containsKey(qw)) {
			
			mp.put(qw, mp.get(qw)+1);}
		else {
			
			mp.put(qw, 1);
		}
		
	}
	
	int max = 0;
	char xc ='p'  ;
	
	for(Character nm : mp.keySet()) {
		
		if(mp.get(nm)>max) {
			
			max  = mp.get(nm);
			xc = nm;
		}
	}
		
	System.out.println( xc +" = " + max);	
		
		
		
	}

}
