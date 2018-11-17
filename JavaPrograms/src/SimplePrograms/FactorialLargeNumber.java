package SimplePrograms;

import java.math.BigInteger;

public class FactorialLargeNumber {

	public static void main(String[] args) {
int number =100;
		BigInteger fact= BigInteger.ONE;
		
		for(int i=1; i<number;i++){
			
			fact=fact.multiply(BigInteger.valueOf(i));
		}
System.out.println(fact);
	}

}

//933262154439441526816992388562667004907159682643816214685929638952175999932299156089414639761565182862536979208272237582511852109168640000000000000000000000