package test;

public class 긴급점검 {

	public static void main(String[] args) {
		String name = "홍길동";
		String name2 = "고길동";
		boolean isTrue = false;
		//1. name과 name2가 같으면 isTrue에 true를 대입
		if(name.equals(name2)) {
			isTrue = true;
		}
		//2. x하고 y가 다르면 isTrue에 false 대입	
		int x = 10;
		int y = 12;
		if(x != y) {
			isTrue = false;
		}
		//3. x가 y보다 작으면 isTrue에 true를 대입	
		if(x < y) {
			isTrue = true;
		}
		isTrue = true;
		if(isTrue) {
			x = 12;
			if(x == y) {
			isTrue = false;
			}
		}
	}

}
