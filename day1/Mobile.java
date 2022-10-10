package week1.day1;

public class Mobile {

	String mobileBrandName="realme";
		char mobileLogo='R';
		short noOfMobilePiece=5;
		int modelNumber=2020;
		long mobileImeiNumber=6915248625L;
		float mobilePrice=99999.99F;
		boolean isdamaged=true;
		public static void main(String[] args) {
			Mobile mobile = new Mobile();
			System.out.println(mobile.mobileBrandName);
			System.out.println(mobile.mobileLogo);
			System.out.println(mobile.noOfMobilePiece);
			System.out.println(mobile.modelNumber);
			System.out.println(mobile.mobileImeiNumber);
			System.out.println(mobile.isdamaged);
	}

}
