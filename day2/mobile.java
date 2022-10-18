package week1.day2;

public class mobile {
	public void sendMessage() {
		System.out.println("Send Message");
	}
	public void shareDocument() {
		System.out.println("Share Document");
	}
	public void call() {
		System.out.println("Call");
	}
	public static void main(String[] args) {
		mobile mymobile =new mobile();
		mymobile.sendMessage();
		mymobile.shareDocument();
		mymobile.call();
		}
	

}
