package SimplePrograms;

public class SwapElements {

	
	public static void main(String[] args) {
int x=10;
int y=20;
System.out.println("Before swaping");
System.out.println(x);
System.out.println(y);
System.out.println("---------------------------------");
x=x+y;
y=x-y;
x=x-y;
System.out.println("After swaping");
System.out.println(x);
System.out.println(y);
System.out.println("---------------------------------");

swap(15,10);
	}

	public static void swap(int a,int b){
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After swaping");
		System.out.println(a);
		System.out.println(b);
	}
}
