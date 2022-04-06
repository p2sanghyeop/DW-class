package 상속;

public class 사과 {

	public static void main(String[] args) {
		busa busa = new busa();

		System.out.println("현재 사과는 : "+busa.getApple()+"개 있습니다.");
		busa.buyApple(20);
		if(busa.getApple() > 0){
			System.out.println("현재 사과는 : "+busa.getApple()+"개 있습니다.");
			busa.eatApple(30);
			System.out.println("현재 사과는 : "+busa.getApple()+"개 있습니다.");
			busa.buyApple(20);
			System.out.println("현재 사과는 : "+busa.getApple()+"개 있습니다.");
			busa.eatApple(30);
			System.out.println("현재 사과는 : "+busa.getApple()+"개 있습니다.");
		}
	}

}
