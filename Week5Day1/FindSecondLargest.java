package Week5Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	public static void main(String[] args) {
		int[] num= {1,2,8,6,9,7,4};
		Set<Integer> num1=new TreeSet<Integer>();
		for (int i = 0; i < num.length; i++) {
			num1.add(num[i]);
		}
		List<Integer> largest=new ArrayList<Integer>(num1);
		int size=largest.size();
		//System.out.println(size);
		Integer value=largest.get(size-2);
		System.out.println("Second Largest Number"+": "+value);
	}

}
