package test;

class User{
	//�ʵ庯��
	String userId;
	String password;
	String rePassword;
	boolean isLogin;
	//������
	public User(String userId, String password, String rePassword, boolean isLogin){
		this.userId = userId;
		this.password = password;
		this.rePassword = rePassword;
		this.isLogin = isLogin;
	}
}
// test ��Ű�� ���� ��  UiTest220408 Ŭ���� ������ ��!
public class UiTest220408 {
	
	public static void main(String[] args) {
		String userId = "sliy7539";
		String password = "sliy7749";
		String rePassword = "sliy7749";
		boolean isLogin = false;
		//1.userId�� ���̵� ������ ���� (���̵�� 20���� ����)
		//2.��й�ȣ�� ���й�ȣ ������ ���� (��й�ȣ ���ڴ� 15���� ����)
		//3.��й�ȣ�� ���й�ȣ ��ġ �ϸ� isLogin�� true ����
		//4.1~3�� �����ϸ� UserŬ���� ȣ��, ������ �Ķ���Ϳ� �� ����.
		if(userId.length()<=20 && password.length()<=15 && rePassword.length()<=15) {
			if(password.equals(rePassword)) {
				isLogin = true;
			}
			if(isLogin) {
				User user = new User(userId, password, rePassword, isLogin);
				System.out.println(userId);
				System.out.println(password);
			}
			else {
				System.out.println("�α��� ����");
			}
		}
	}
}
