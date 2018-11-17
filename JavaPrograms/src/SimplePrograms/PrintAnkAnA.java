package SimplePrograms;

public class PrintAnkAnA {

	public static void main(String[] args) {
        int length=4;
		String str="Ankush";
		for (int i=0;i<length;i++){
			for(int j=0;j<length-i;j++){
				System.out.print(str.charAt(j));
			}
		}
	}

}
