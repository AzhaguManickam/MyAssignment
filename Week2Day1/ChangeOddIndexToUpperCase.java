package Week2Day1;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		String name="AbAbAbAbAbAbAbA";
	char[] charArray=name.toCharArray();
	int length=charArray.length;
	for (int i = 0; i < charArray.length; i++) {
		if(i%2==0) {
			System.out.print((charArray[i]));
			
		}
		
	}

}



}
