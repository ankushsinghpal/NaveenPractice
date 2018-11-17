package SimplePrograms;

public class PrintPyramidPattern {

	public static void main(String[] args) {
		
		for(int i=6;i>0;i--){
		//	System.out.print(" "+i);
			
			
			for(int j=i-1;j>0;j--){
				System.out.print(" "+j);
				
			}
			System.out.println();
		}

	System.out.println("**********************************************************************");
for (int k=5;k>0;k--){
	for(int l=1;l<=k;l++){
		System.out.print(" "+l);
	}
	System.out.println();
}
}
}
