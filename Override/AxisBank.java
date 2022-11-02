package Override;

public class AxisBank extends BankInfo {
	public void deposit(){
		System.out.println("1500");
	}
	public static void main(String[] args) {
		AxisBank bank=new AxisBank();
		bank.deposit();
	}
}
