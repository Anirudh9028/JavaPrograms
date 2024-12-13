package programsOnString;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterCount {

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
	for(Character nm : mp.keySet()) {
		
		if(mp.get(nm)>1) {System.out.println(nm +" = " + mp.get(nm));}
	}
		
		
		
		
		

	}

}
