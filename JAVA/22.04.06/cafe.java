package ���;


class coffee{
	int count;
	
	public int getCoffee() {
		return this.count;
	}
	public void buyCoffee(int count) {
		 this.count+=count ;
		if(count>0 && count==10) {
			System.out.println("�����");
		}
		if(count>10 && count==20) {
			System.out.println("�ǹ�");
		}
		if(count>20 && count==30) {
			System.out.println("���");
		}
	}
}

public class cafe {

	public static void main(String[] args) {
		coffee coffee = new coffee();
		System.out.println("����Ŀ��"+coffee.getCoffee());
		coffee.buyCoffee(20);
		if(coffee.getCoffee()>0) {
			System.out.println("Ŀ��"+ coffee.getCoffee()+"����");
		}
	
	}

}
