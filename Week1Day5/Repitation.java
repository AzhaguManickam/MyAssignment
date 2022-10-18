package Week1Day5;

public class Repitation {
	public static void main(String[] args) {
		String words="welcome to chennai";
		char[] array=words.toCharArray();
		int length=array.length;
		int count=0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]=='e'){
				count++;
				
			}
			
		}
		System.out.println("e repeatance="+ count + "times" );
				
	}

}
