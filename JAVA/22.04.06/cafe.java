package ���;
class coffee{
	int count;
	
	public int getCoffee() {
		return this.count;
	}
	public void buyCoffee(int count) {
		int sum = this.count+=count ;
		 System.out.println("Ŀ��"+count+"����");
		if(10<sum && sum<=20) {
			System.out.println("�����");
		}
		if(20<sum && sum<=30) {
			System.out.println("�ǹ�");
		}
		if(sum>30) {
			System.out.println("���");
		}
	}
	public void drinkCoffee(int count){ 
		if(this.count >= count){
			System.out.println("Ŀ�Ǹ� "+count+"�� ����");
			this.count -= count;
		}else{
			System.out.println("Ŀ�Ǻ���"+count+"�� ��ŭ ������");
		}
}
}
public class cafe {

	public static void main(String[] args) {
		coffee coffee = new coffee();
		System.out.println("����Ŀ��"+coffee.getCoffee());
		coffee.buyCoffee(20);
		if(coffee.getCoffee()>0) {
			System.out.println("����Ŀ��"+ coffee.getCoffee());
			coffee.drinkCoffee(30);
			System.out.println("����Ŀ��"+ coffee.getCoffee());
			coffee.buyCoffee(10);
			System.out.println("����Ŀ��"+ coffee.getCoffee());
		}
	
	}

}
