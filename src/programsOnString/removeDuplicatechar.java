package programsOnString;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicatechar {

	public static void main(String[] args) {
		
		
		
		String rt = "Anirudha";
		String hj = rt.toLowerCase();
		
		Set<Character> op = new LinkedHashSet<Character>();
		String sd = "";
		
		for(int i = 0; i <hj.length();i++) 
		{
			
			 op.add(hj.charAt(i));
			
		}
		
		for(Character nm : op) {
			
			sd = sd + nm;
		}
		
		System.out.println(sd);
		
	}

}
