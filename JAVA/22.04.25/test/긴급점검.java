package test;

public class ������� {

	public static void main(String[] args) {
		String name = "ȫ�浿";
		String name2 = "��浿";
		boolean isTrue = false;
		//1. name�� name2�� ������ isTrue�� true�� ����
		if(name.equals(name2)) {
			isTrue = true;
		}
		//2. x�ϰ� y�� �ٸ��� isTrue�� false ����	
		int x = 10;
		int y = 12;
		if(x != y) {
			isTrue = false;
		}
		//3. x�� y���� ������ isTrue�� true�� ����	
		if(x < y) {
			isTrue = true;
		}
		isTrue = true;
		if(isTrue) {
			x = 12;
			if(x == y) {
			isTrue = false;
			}
		}
	}

}
