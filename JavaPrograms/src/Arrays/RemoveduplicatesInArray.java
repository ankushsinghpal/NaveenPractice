package Arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveduplicatesInArray {

	public static void main(String[] args) {
		String []duplicates=new String[]{"Ankush","Pal","Ankush","Singh","Indu","Sarmal","Indu"};
		Set<String> duplicateset=new HashSet<String>();
		Set<String> nonduplicateset=new HashSet<String>();
		
		for(String string: duplicates){
			
			if(!nonduplicateset.contains(string)){
				
				nonduplicateset.add(string);
			}
			else{
				duplicateset.add(string);
			}
		}
		System.out.println("Removing duplicates from string" +nonduplicateset);
		System.out.println("duplicates from string" +duplicateset);
	}

}
