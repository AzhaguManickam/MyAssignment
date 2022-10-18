package week1day3;

public class DuplicateNumbers {
	public static void main(String[] args) {
		int[] num= {10,20,30,40,10,10,50,50,60};
		for (int i = 0; i < num.length; i++) {
		for (int j = i+1; j < num.length; j++) {
			if(num[i]==num[j]) {
				System.out.println(num[i]);
						
			}
		}
		}
	

	}
}
