package Week5Day1;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicateNumbers {
public static void main(String[] args) {
	int[] num= {1,2,3,6,5,4,2,3,6};
	List<Integer> number=new ArrayList<Integer>();
	for (int i = 0; i < num.length; i++) {
		for (int j = i+1; j < num.length; j++) {
			if(num[i]==num[j]) {
				number.add(num[i]);
			}
			
		}
		
	}
	System.out.println(number);
}
}
