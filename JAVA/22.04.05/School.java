package 상속;

class student_A{
	public void 공부하다() {
		System.out.println("JAVA 공부");
	}
	public void 땡땡이하다() {
		System.out.println("PC방에 가다");
	}
}
class student_B{
public void 공부하다() {
	System.out.println("SQL 공부");
	}
public void 땡땡이하다() {
	System.out.println("수업에 나오지 않다");
}
}
class student_C{
public void 공부하다() {
	System.out.println("HTML 공부");
	}
public void 땡땡이하다() {
	System.out.println("꾀병을 부리다");
}
}
public class School {

	public static void main(String[] args) {
	student_A sa = new student_A();
	sa.공부하다();
	sa.땡땡이하다();
	student_B sb = new student_B();
	sb.공부하다();
	sb.땡땡이하다();
	student_C sc = new student_C(); 
	sc.공부하다();
	sc.땡땡이하다();
	}

}
