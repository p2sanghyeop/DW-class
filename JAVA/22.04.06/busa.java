package ���;

public class busa {
		int count;
		
		public int getApple() {
			return this.count;
		}
		public void buyApple(int count) {
			System.out.println("�������");
			this.count += count;
		}
		public void eatApple(int count) {
			if(this.count >=count) {
				System.out.println("�������");
				this.count-=count;
			}
			else {
				System.out.println("�������");
			}
		}
}
