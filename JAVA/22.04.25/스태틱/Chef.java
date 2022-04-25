package 스태틱;

public class Chef {

	private static Chef chef = null;//static으로 선언된 클래스 변수
	public static Chef getInstance() {//static으로 선언된 메소드
		if(chef == null) {
			chef = new Chef();
		}
		return chef;
		
		}
	public void printHello() {
		System.out.println("hello world");
	}
}
