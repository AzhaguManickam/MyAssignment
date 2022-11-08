package Week5Day1;

import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicatesletter {
	public static void main(String[] args) {

	String name="manickam";
	char[] name1=name.toCharArray();
	Set<Character> object=new LinkedHashSet<Character>();
	for (int i = 0; i < name1.length; i++) {
		object.add(name1[i]);
		
		
	}
	System.out.println(object);
	
}
}
