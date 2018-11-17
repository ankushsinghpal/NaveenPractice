package SimplePrograms;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the value of n: ");
	int num=sc.nextInt();
	System.out.print("Enter the value of n: ");
	int num1=sc.nextInt();
	System.out.println(num);
	fibonacciseries(num);
	
	for(int i=0;i<=num1;i++){
	System.out.println(fibonacciseriesRecursion(i)+ " ");
	}
	}
	public static void fibonacciseries(int n){
		
		if(n==0){
			System.out.println("0");
		}
		else if(n==1){
			System.out.println("0 1");
		}
		else{
			System.out.println("0 1 ");
			int n1=0;
			int n2=1;
			for(int i=1;i<n;i++){
				
				int n3=n1+n2;
				System.out.println(n3+ " ");
				n1=n2;
				n2=n3;
				
			}
		}
	}
	
	public static int fibonacciseriesRecursion(int n){
		if(n==0){
			return 0;
		}
		else if(n==1){
			return 1;
		}
		else{
			return fibonacciseriesRecursion(n-1)+fibonacciseriesRecursion(n-2);
		}
	}

}
