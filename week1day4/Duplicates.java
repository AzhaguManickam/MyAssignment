package week1day4;

public class Duplicates {
	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,6,9,8,7,5,6,2,5,};
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if(num[i]==num[j]) {
					System.out.println(num[i]);
				}
				
			}
			
		}
	}

}
