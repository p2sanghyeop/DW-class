package 스태틱;

class Dw{
	String className;
	String studentName; 
	public Dw() {//오버로딩
		
	}
	public Dw(String className, String studentName) {
		this.className = className;
		this.studentName = studentName;
	}

}

public class 긴급점검2 {
	//생성자 : 초기화
	public static Dw printstudent(){
		Dw d = new Dw("스마트웹&앱과정","홍길동");
		return d;
	}
	public static int getNumber() {//무조건 20이상 리턴
		int x = 0;
		if (x<=20) {
			x=20;
		}
		return x;
	}
	public static void main(String[] args) {
		//방법1
		Dw d =  printstudent();
		System.out.println(d.className+d.studentName);
		//방법2
		 System.out.println(printstudent().className+printstudent().studentName);
		 int result = getNumber();
		 System.out.println(result);
		 
	}

}
