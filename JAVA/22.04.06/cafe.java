package 상속;
class coffee{
	int count;
	
	public int getCoffee() {
		return this.count;
	}
	public void buyCoffee(int count) {
		 this.count+=count ;
		 System.out.println("커피"+count+"구입");
		if(0<count && count<=10) {
			System.out.println("브론즈");
		}
		if(10<this.count && this.count<=20) {
			System.out.println("실버");
		}
		if(count>20) {
			System.out.println("골드");
		}
	}
	public void drinkCoffee(int count){ //먹은 사과
		if(this.count >= count){
			System.out.println("커피를 "+count+"개 마심");
			this.count -= count;
		}else{
			System.out.println("커피부족"+count+"개 만큼 못마심");
		}
}
}
public class cafe {

	public static void main(String[] args) {
		coffee coffee = new coffee();
		System.out.println("현재커피"+coffee.getCoffee());
		coffee.buyCoffee(20);
		if(coffee.getCoffee()>0) {
			System.out.println("마신커피"+ coffee.getCoffee());
			coffee.buyCoffee(10);
			System.out.println("마신커피"+ coffee.getCoffee());
		}
	
	}

}
