package ����ƽ;

public class StaticMain {

	public static void main(String[] args) {
		
		StaticStudy s = new StaticStudy();
		++s.count;
		System.out.println(s.count);
		StaticStudy s2 = new StaticStudy();
		System.out.println(s2.count);
		//����ƽ���� ����� ����, �޼ҵ�� new(�ν��Ͻ�ȭ)�� ���� �ʾƵ� ����Ҽ� �ִ�
		System.out.println(StaticStudy.GamgI);
		
		Chef c = Chef.getInstance();//�ν��Ͻ�ȭ�� �� �޼ҵ带 ����ƽ���� ������
		//�ַ� ����� ��ü(Ŭ����)�� ������ �����ؼ� ����ϴ� ��Ȳ���� ���� ���
		c.printHello();
	}

}
