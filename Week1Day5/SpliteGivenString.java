package Week1Day5;

public class SpliteGivenString {
	public static void main(String[] args) {
	String words="I am in always with you";
	String[] split=words.split(" ");
    for(int i=0;i<split.length;i++) {
    	System.out.println(split[i]);
    	    }
    System.out.println(split.length);
    int count=0;
    for(int i=0;i<split.length;i++) {
    	count++;
    	
    }
    System.out.println("count="+count);
    	 
    }
    
}
