package org.system;

public class Desktop extends Computer{
	public void desktopSize(float desktopSize) {
		System.out.println("Desktop Size"+": "+desktopSize);
	}
	public static void main(String[] args) {
		
	Desktop desktop=new Desktop();
    desktop.computerModel("Windows11");
    desktop.desktopSize(44.56F);
}
}