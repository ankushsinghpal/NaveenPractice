package StringsPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class DupliateElements {

	public static void main(String[] args) {

		String str= "Ankush pal singh";
		
		HashMap <Character,Integer> charcount = new LinkedHashMap<Character, Integer>();
		
		for (int i=0;i<str.length();i++){
			
			//get character while looping over a string
			char c=str.charAt(i);
			
			if(charcount.containsKey(c)){
				
				charcount.put(c, charcount.get(c)+1);
				
			}
			
			else {
				
				charcount.put(c, 1);
			}
		}
		
		for(Character ch : charcount.keySet()){
			
			if(charcount.get(ch)>1){
				System.out.println("duplicate character : " + ch + " ====== " + " count : " + charcount.get(ch));
			}
		}
	}

}
