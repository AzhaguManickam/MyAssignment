package week1day3;

public class FibonassiSeries {
	public static void main(String[] args) {
		int n=7;
		int firstnumber=1,secondnumber=1,thirdnumber;
		System.out.println(firstnumber);
		System.out.println(secondnumber);
		for(int i=3;i<=n;i++)
		{
			thirdnumber=firstnumber+secondnumber;
			System.out.println(thirdnumber);
			firstnumber=secondnumber;
			secondnumber=thirdnumber;
		}
		
	}

}
