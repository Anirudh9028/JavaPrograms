package programsOnString;

import java.util.HashMap;
import java.util.Map;

/*
 find the first unique character from the string 
  
 * */
public class findTheFirstUniquecharacter {

	public static void main(String[] args) {
		

		String str = "swiss";
		String ty = str.toLowerCase();
		char [] ui = ty.toCharArray();
		
		Map<Character ,Integer> mp = new HashMap<Character ,Integer>();
		
		for(char rt : ui) {
			
			
			if(mp.containsKey(rt)) 
			{
				mp.put(rt, mp.get(rt)+1);
			}
			else
			{
				mp.put(rt, 1);
			}
			
		}
		
		
		for(Character op : mp.keySet()) {
			
			//System.out.println(op +"  =  "+ mp.get(op));
			
			if(mp.get(op)==1) {
				
				System.out.println("first unique character is = " + op);
				break;
			}
			
		}
		
	}

}
