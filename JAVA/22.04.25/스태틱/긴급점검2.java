package ����ƽ;

class Dw{
	String className;
	String studentName; 
	public Dw() {//�����ε�
		
	}
	public Dw(String className, String studentName) {
		this.className = className;
		this.studentName = studentName;
	}

}

public class �������2 {
	//������ : �ʱ�ȭ
	public static Dw printstudent(){
		Dw d = new Dw("����Ʈ��&�۰���","ȫ�浿");
		return d;
	}
	public static int getNumber() {//������ 20�̻� ����
		int x = 0;
		if (x<=20) {
			x=20;
		}
		return x;
	}
	public static void main(String[] args) {
		//���1
		Dw d =  printstudent();
		System.out.println(d.className+d.studentName);
		//���2
		 System.out.println(printstudent().className+printstudent().studentName);
		 int result = getNumber();
		 System.out.println(result);
		 
	}

}
