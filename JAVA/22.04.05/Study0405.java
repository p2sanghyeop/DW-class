package ���;

class Pizza{
	int money;//��������, �ʵ庯��
	//�ʵ庯��(��������)�� ����Ʈ�� ���� �ʱ�ȭ �Ǿ� ����
	
	public int getMoney() {
		return 0;
	}
	//Ŭ���������� ����� ����Ʈ �����ڰ� ������
	public Pizza(int x) {//������(����Ÿ���� ���� �Լ�) vs �Ϲ��Լ�(�޼ҵ�)
 		//�����ڴ� returnŸ���� �������� ����
		//�����ڴ� ���� �ʱ�ȭ �ϴ°� ����
		//�Լ��� �Ķ���Ϳ� ���� �޾Ƽ� ����� ó���ϴ°� ����
		this.money = x;//this �ش� class�� �ǹ�
	}
}// end Pizza class

public class Study0405 {

	public static void main(String[] args) {
		Pizza p = new Pizza(10); //�ڹ� Ư¡ �ƴ�! ��ü������ Ư¡
		p = new Pizza(30);
		//new�� �̿��ؼ� Ŭ������ ȣ���Ҷ� �����ڰ� �ڵ����� ȣ���
		//������ ȣ��
		//1. Ŭ������ ������ Ÿ��
		int x = 10;
		String name = "ȫ�浿";
		System.out.println(p.money);
	}

}
