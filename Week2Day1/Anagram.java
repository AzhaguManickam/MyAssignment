package Week2Day1;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String name1="listen";
		String name2="stenli";
		char[] txt1=name1.toCharArray();
	    char[] txt2=name2.toCharArray();
	    if(txt1.length!=txt2.length) {
	    	System.out.println("not an anagram");
	    }
	    		Arrays.sort(txt1);
	    		Arrays.sort(txt2);
	    		for (int i = 0; i < txt1.length; i++) {
					if(txt1[i]!=txt2[i]) {
						System.out.println("Not anagram");
						
					}
						
				}
	    		System.out.println("Anagram");
	}

}
