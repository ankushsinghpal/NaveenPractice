package Arrays;

import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicatesWithoutSet {
	

		  public static void main(String[] args) 
		  {

		List<String> lst = new LinkedList<String>();

		        lst.add("ABC");

		        lst.add("ABC");

		        lst.add("ABCD");

		        lst.add("ABCD");

		        lst.add("ABCE");

		        System.out.println("Duplicates List "+lst);

		        Object[] array = lst.toArray();

		           for (Object s : array) 
		           {

		                if (lst.indexOf(s) != lst.lastIndexOf(s)) {

		                lst.remove(lst.lastIndexOf(s));

		             }

		          }

		        System.out.println("Distinct List "+lst);

		}

		}

