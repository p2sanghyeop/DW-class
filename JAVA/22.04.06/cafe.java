package ���;
class coffee{
	int count;
	
	public int getCoffee() {
		return this.count;
	}
	public void buyCoffee(int count) {
		 this.count+=count ;
		 System.out.println("Ŀ��"+count+"����");
		if(0<count && count<=10) {
			System.out.println("�����");
		}
		if(10<this.count && this.count<=20) {
			System.out.println("�ǹ�");
		}
		if(count>20) {
			System.out.println("���");
		}
	}
	public void drinkCoffee(int count){ //���� ���
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
			coffee.buyCoffee(10);
			System.out.println("����Ŀ��"+ coffee.getCoffee());
		}
	
	}

}
