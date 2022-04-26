package 스태틱;

public class StaticMain {

	public static void main(String[] args) {
		
		StaticStudy s = new StaticStudy();
		++s.count;
		System.out.println(s.count);
		StaticStudy s2 = new StaticStudy();
		System.out.println(s2.count);
		//스태틱으로 선언된 변수, 메소드는 new(인스턴스화)를 하지 않아도 사용할수 있다
		System.out.println(StaticStudy.GamgI);
		
		Chef c = Chef.getInstance();//인스턴스화가 된 메소드를 스태틱으로 공유함
		//주로 공통된 객체(클래스)를 여러개 생성해서 사용하는 상황에서 많이 사용
		c.printHello();
	}

}
