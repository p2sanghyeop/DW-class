package ���;

public class Home {

	public static void main(String[] args) {
		Dw dw = new Dw("��浿", "������", 17);//�ν��Ͻ�ȭ �ϴ�(������ �ҷ�����)
//		dw.setName("ȫ�浿");
//		dw.setClassName("DW��ī����");
//		dw.setStudentCount(13);
		//name, className, studentCoutn ������ set�� �ؾ��ϴ� �̽�
		Dw dw05 = new Dw("��浿", "��Ƽ�÷�������",30);
		String name = dw.getName();
		System.out.println("�л��̸�"+name);
		String ac = dw.getClassName();
		System.out.println("�п��̸�"+ac);
		int count = dw.getStudentCount();
		System.out.println("�л���"+count);
		
		Dw dw02= null;
		if(dw02 == null) {
			dw02 = new Dw("����","�˼�",15);
		}
			int x=0;
			if(x==0) {
				x=10;
			}
	}

}
