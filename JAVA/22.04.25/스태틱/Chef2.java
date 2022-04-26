package ½ºÅÂÆ½;

public class Chef2 {
	static Chef2 c2;
	public Chef2 getInstance() {
		c2 = new Chef2();
		return new Chef2();
	}
	public void printHello() {
		System.out.println("hello world");
	}
	

}
