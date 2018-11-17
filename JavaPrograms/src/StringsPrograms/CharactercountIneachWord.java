package StringsPrograms;

public class CharactercountIneachWord {


	public static void main(String[] args) {
   count("Hello World Please be a little human");

	}

	public static void count(String str){
		
		char ch[]=str.toCharArray();
		
		for (int i=0;i<str.length();i++){
			
			//declare a string with empty initialization
			
			String s="";
			
			//when the character is not space
			while(i<ch.length && ch[i]!=' '){
				
				// concat with the declared string
				s=s+ch[i];
				i++;				
			}
		if(s.length()>0){
			System.out.println(s + "->" + s.length());
		}
			
		}
	}
}
