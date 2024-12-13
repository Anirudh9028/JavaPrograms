package programsOnString;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicateWord {

	public static void main(String[] args) {
		
		
		
		String rt = "Anirudha java java hi buddy";
		String hj []= rt.toLowerCase().split(" ");
		
		Set<String> op = new LinkedHashSet<String>();
		String sd = "";
		
		for(int i = 0; i <hj.length;i++) 
		{
			
			 op.add(hj[i]);
			
		}
		
		for(String nm : op) {
			
			sd = sd + nm + " ";
		}
		
		System.out.println(sd);
		
	}

}
