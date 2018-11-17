package Arrays;

import java.util.Arrays;

//initialize one integer array
//Need to know actual array size
//calculate expected total by n(n+1)/2 formula
//calculate actual total by adding each element of array
//Deduct Expected and actual which will give you missing number in the array 
public class FindMissingNumberInArray {

	public static void main(String[] args) {

		int array[]={1,2,4,5,6};
	int missingNumber=	getmissingNumber(array,6);
		System.out.printf("missing number in arrays %s is %d %n ",Arrays.toString(array),missingNumber);
	}
	
	
public static int getmissingNumber(int arr[],int n){
	// n=8; //it is n+1.
	 int actualSum=0;
	 int expectedSum=(n*(n+1)/2);
	//System.out.println(expectedSum);
	//for(int i=0;i<arr.length;i++){
		
	//	actualSum=actualSum+ arr[i];
//	}
	//System.out.println(actualSum);

	for(int i :arr){
		actualSum=actualSum+i;
	}
	return expectedSum-actualSum;
}
}
