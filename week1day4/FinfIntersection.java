package week1day4;

public class FinfIntersection {
	public static void main(String[] args) {
		int[] array1= {5,10,15,20,25};
		int[] array2= {4,10,15,21,26};
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				if(array1[i]==array2[j]) {
					System.out.println(array1[i]);
				}
				
			}
			
		}
		
	}

}
