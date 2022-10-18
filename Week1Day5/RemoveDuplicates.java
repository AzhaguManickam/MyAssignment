package Week1Day5;

public class RemoveDuplicates {             
	public static void main(String[] args) {
		String name="manickam";
		char[] charArray=name.toCharArray();
	    int length= charArray.length;
	    for (int i = 0; i < charArray.length; i++) {
	    	for (int j = i+1; j < charArray.length; j++) {
	    	if(charArray[i]==charArray[j]) {
	    		System.out.println(charArray[i]);
	    		
	    	}
				
			}
			
		}
	}

}
