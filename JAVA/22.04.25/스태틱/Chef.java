package ����ƽ;

public class Chef {

	private static Chef chef = null;//static���� ����� Ŭ���� ����
	public static Chef getInstance() {//static���� ����� �޼ҵ�
		if(chef == null) {
			chef = new Chef();
		}
		return chef;
		
		}
	public void printHello() {
		System.out.println("hello world");
	}
}
