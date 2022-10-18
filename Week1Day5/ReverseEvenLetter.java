package Week1Day5;

public class ReverseEvenLetter {
	public static void main(String[] args) {
		String name="manickam";
		char[]charArray=name.toCharArray();
		int length=charArray.length;
		for (int i =charArray.length-1;i>=0; i--) {
			if(i%2==0) {
				System.out.println(charArray[i]);
			}
			
			
		}
				
				
	}
}


