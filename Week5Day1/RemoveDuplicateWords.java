package Week5Day1;

import java.util.LinkedHashSet;
import java.util.Set;
;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		String text="We learn java basics as part of java sessions in java week1";
		text.toLowerCase();
		String[] array=text.split(" ");
		Set<String> object=new LinkedHashSet <>();
		for(int i=0;i<array.length;i++) {
			object.add(array[i]);	
		}
		System.out.println(object);
		
	}

}
