package ��������;

import java.util.ArrayList;
import java.util.List;

class Members{
	private String name;
	private List<String> stone;

	public List<String> getStone() {
		return stone;
	}

	public void setStone(List<String> stone) {
		this.stone = stone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
public class Avengers {
	
	public static Members printMemberName(Members member) {
		if(member == null) {
			member = new Members();
		}
		member.setName("�丣");
		List<String> list = new ArrayList<String>();
		list.add("�Ŀ�����");
		member.setStone(list);
		return member;
	}
	
	public static void main(String[] args) {
		Members m = new Members();
		m.setName("�丣");
		String name = m.getName();
		System.out.println(name);
		Members m2 = new Members();//m�� m2�� �и����ְ� ������ new�� ����
		//m2 =m �̶���ϸ� m�� m2�� ������ �ȴ�
		String name2 = m2.getName();
		System.out.println(name2);//class �� �ʱⰪ�� null�̴�
		//���1
		printMemberName(m);
		//���2
		printMemberName(new Members());
		//���3
//		Members m3=null;
		Members m3 = new Members(); 
		printMemberName(m3);
		System.out.println(m3);
		String powerStone = m3.getStone().get(0);
		System.out.println(powerStone);
	}

}
