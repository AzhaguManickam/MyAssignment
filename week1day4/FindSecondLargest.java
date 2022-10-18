package week1day4;

import java.util.Arrays;

public class FindSecondLargest {
	public static void main(String[] args) {
		int data[]= {5,8,6,9,7};
		int n=data.length;
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));
		for (int i = 0; i < data.length; i++) {
			
		}
		System.out.println("Second highest Number" + data[n-2]);
	}

}

