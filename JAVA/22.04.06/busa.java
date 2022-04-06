package 상속;

public class busa {
		int count;
		
		public int getApple() {
			return this.count;
		}
		public void buyApple(int count) {
			System.out.println("사과구매");
			this.count += count;
		}
		public void eatApple(int count) {
			if(this.count >=count) {
				System.out.println("사과먹음");
				this.count-=count;
			}
			else {
				System.out.println("사과부족");
			}
		}
}
