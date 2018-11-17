package Arrays;

import java.util.ArrayList;

public class UniqueNumberFromArray {

	public static void main(String[] args) {
		
		int a[]={4,4,5,8,5,6,7,8,2,4,7,5,8,9};
		
		ArrayList<Integer> inp=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++){
			
			int k=0; //it need to be refreshed for every value inside loop
			
			if(!inp.contains(a[i])){
				
				inp.add(a[i]);
				
				k++;
				
				for(int j=i+1;j<a.length;j++){
					
					if(a[i]==a[j]){
						
						k++;
						System.out.println(a[j]+ " is duplictae number");
					}
				}
				//System.out.println(a[i]);
				//System.out.println(k);
				if(k==1){
					System.out.println(a[i] +" is unique number");
					 
				}
			}
			
		}
	}

}
