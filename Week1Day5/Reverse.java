package Week1Day5;

public class Reverse {
	public static void main(String[] args) {
		String name= "Manickam";
		String a=name.toUpperCase();
		//char[] charArray=name.toUpperCase();
		
		/*
		 * for (int i = 0; i < charArray.length; i++) {
		 * System.out.println(charArray[i]);
		 * 
		 * 
		 * }
		 */
		for (int i =a.length()-1;i>=0; i--) {
			System.out.print(a.charAt(i));
			
		}
	}

}
