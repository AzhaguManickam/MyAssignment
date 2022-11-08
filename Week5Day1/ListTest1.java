package Week5Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest1 {
	public static void main(String[] args) {
		String[] companyName= {"HCL","Wipro","AspireSystems","CTS"};
		List<String> name=new ArrayList<String>();
		
		for (String string : companyName) {
			System.out.println(string);
			name.add(string);
			
		}
		
		System.out.println(name);
		
		
	}

}
