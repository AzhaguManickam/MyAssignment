package week1.day2;

public class calculator {
	public void additionTwoNumber(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void subractionTwoNumbers(int e,int f) {
	    int g=e-f;
	    System.out.println(g);
	    }
	public void multiplyTwoNumber(double i,double j) {
		double k=i*j;
		System.out.println(k);
	}
	public void divideTwoNumbers(float x,float y) {
		float z=x/y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		calculator calc=new calculator();
		calc.additionTwoNumber(77,88);
		calc.subractionTwoNumbers(50,25);
		calc.multiplyTwoNumber(55,55);
		calc.divideTwoNumbers(88.2f,65.32f);
	}

}
