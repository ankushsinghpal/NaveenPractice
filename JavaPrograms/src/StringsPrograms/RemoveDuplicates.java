package StringsPrograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void main(String args[]){
		String str="ankushpalsingh";
	
		System.out.println(removeduplicates(str));
		
	}
	public static String removeduplicates(String str){
	
	
	Set<Character> set=new HashSet<Character>();
	StringBuffer sb=new StringBuffer();
for (int i=0;i<str.length();i++){
	
	//find the CHARACTERS AT PARTICULAR INDEXES
	Character c=str.charAt(i);
	if(!set.contains(c)){
		
		set.add(c);
		sb.append(c);	
	}
	
}
return sb.toString();
}
}
//output ankushplig
