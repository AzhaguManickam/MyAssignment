package Week2Day1;

public class CharOccurance {
public static void main(String[] args) {
	String txt="habibi come to dubai";
	char[] charArray = txt.toCharArray();
	int count=0;
	int len=charArray.length;
	for (int i = 0; i < len; i++) {
		if(charArray[i]=='b') {
			count++;
		}
		
		
	}
	System.out.println(count);
}
}
