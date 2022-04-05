package 상속;

class Pizza{
	int money;//전역변수, 필드변수
	//필드변수(전역변수)는 디폴트로 값이 초기화 되어 있음
	
	public int getMoney() {
		return 0;
	}
	//클래스파일을 만들면 디폴트 생성자가 생성됨
	public Pizza(int x) {//생성자(리턴타입이 없는 함수) vs 일반함수(메소드)
 		//생성자는 return타입을 정의하지 않음
		//생성자는 값을 초기화 하는게 목적
		//함수는 파라미터에 값을 받아서 결과를 처리하는게 목적
		this.money = x;//this 해당 class를 의미
	}
}// end Pizza class

public class Study0405 {

	public static void main(String[] args) {
		Pizza p = new Pizza(10); //자바 특징 아님! 객체지향언어 특징
		p = new Pizza(30);
		//new를 이용해서 클래스를 호출할때 생성자가 자동으로 호출됨
		//생성자 호출
		//1. 클래스도 데이터 타입
		int x = 10;
		String name = "홍길동";
		System.out.println(p.money);
	}

}
