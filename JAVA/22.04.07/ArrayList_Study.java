package �÷�����;

import java.util.ArrayList;

public class ArrayList_Study {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();//()������
		//<> : ���׸�
		//add : �����͸� list�� ����
		//list�� ����� ��â �Ľ�Ÿ
		list.add("�ñ�ġ �Ľ�Ÿ");
		list.add("��â �Ľ�Ÿ");
		list.add("��â �Ľ�Ÿ");
		list.add("��â �Ľ�Ÿ");
		list.add("��â �Ľ�Ÿ");
		
		int len = list.size();//list���� ȣ��
		System.out.println("list ���� -> "+len);
		
		String value = list.get(0);
		System.out.println(value);
		String value1 = list.get(1);
		System.out.println(value1);
		
		int count=0;
		for(int i=0; i<len; ++i) {
			String value3 = list.get(i);
			System.out.println(value3);
			if(value3.equals("��â �Ľ�Ÿ")) {
				++count;
			}
		}
		System.out.println(count);
		
		//int�� ��� ArrayList
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(40);
		list2.add(60);
		list2.add(80);
		list2.add(30);
		//list�� �߰��� ���� ���ձ��ϱ�
		int sum = 0;
		for(int i=0; i<list2.size(); ++i) {
			if(list2.get(i) != 40) {
			sum += list2.get(i);
			}
		}
		System.out.println(sum);
		
		
		
		
		
		int []array = {0};//int�� �迭
	}
}
