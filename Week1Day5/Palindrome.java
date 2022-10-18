package Week1Day5;

public class Palindrome {
	public static void main(String[] args) {
		String word1="madam";
		String word2="";
		for (int i =word1.length()-1;i>=0;i--) {
			word2=word2+word1.charAt(i);
			}
		System.out.println(word2);
		if(word1.equals(word2)) {
			System.out.println("The given word is palindrome");
		}
		else {
			System.out.println("The given word is not a palindrome");
		}
			
	}

}
