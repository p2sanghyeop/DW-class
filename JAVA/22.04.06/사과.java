package ���;

public class ��� {

	public static void main(String[] args) {
		busa busa = new busa();

		System.out.println("���� ����� : "+busa.getApple()+"�� �ֽ��ϴ�.");
		busa.buyApple(20);
		if(busa.getApple() > 0){
			System.out.println("���� ����� : "+busa.getApple()+"�� �ֽ��ϴ�.");
			busa.eatApple(30);
			System.out.println("���� ����� : "+busa.getApple()+"�� �ֽ��ϴ�.");
			busa.buyApple(20);
			System.out.println("���� ����� : "+busa.getApple()+"�� �ֽ��ϴ�.");
			busa.eatApple(30);
			System.out.println("���� ����� : "+busa.getApple()+"�� �ֽ��ϴ�.");
		}
	}

}
