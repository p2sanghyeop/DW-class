package ���;

//�׻� Ŭ�����̸� �տ��� �빮��
public class Dw {
	String name; //�л��̸�
	String className; //���� �̸�
	int studentCount; //�л��� 
	
	//1. ������ �̸��� Ŭ�����̸��� ����
	//2. return type�� ����.
	public Dw(String name, String className, int studentCount) {
		this.name = name;
		this.className = className;
		this.studentCount = studentCount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public int getStudentCount() {
		return studentCount;
	}
	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}
	
	//1. �����ڿ� �Ķ���;��� �ʵ庯�� �ʱ�ȭ
	//getter, setter
}
