package StringsPrograms;

import java.util.Scanner;

public class CountNumberOfVowelsInString {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
    String str=sc.nextLine();
    
    //convert the string to char array
    char [] charcs=str.toCharArray();
    int count=0;
    
    //transverse through each character of string
    
    for(char c: charcs){
    	
    	switch(c){
    	
    	case 'a':
    	case 'e':
    	case 'i':
    	case 'o':
    	case 'u':
    	case 'A':
    	case 'E':
    	case 'I':
    	case 'O':
    	case 'U':
    	
    		
    		count++;
    		break;
    	}  	
    }
    
    System.out.println("The count of vowels is "+ count);
	}
		
}
