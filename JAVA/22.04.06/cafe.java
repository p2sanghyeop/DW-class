package 상속;


class coffee{
	int count;
	
	public int getCoffee() {
		return this.count;
	}
	public void buyCoffee(int count) {
		 this.count+=count ;
		if(count>0 && count==10) {
			System.out.println("브론즈");
		}
		if(count>10 && count==20) {
			System.out.println("실버");
		}
		if(count>20 && count==30) {
			System.out.println("골드");
		}
	}
}

public class cafe {

	public static void main(String[] args) {
		coffee coffee = new coffee();
		System.out.println("현재커피"+coffee.getCoffee());
		coffee.buyCoffee(20);
		if(coffee.getCoffee()>0) {
			System.out.println("커피"+ coffee.getCoffee()+"결제");
		}
	
	}

}
