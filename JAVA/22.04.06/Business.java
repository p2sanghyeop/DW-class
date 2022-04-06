package 상속;

public class Business {
	double money;
	
	
	public double  sumMoney(double money) {
		double sum = this.money += money;
		double rate = 0;
		double total = 0;
		if(sum>0 && sum < 1000000) {
			System.out.println(sum+"입금");
		}
		if(sum >= 1000000) {
			rate = (sum*0.1);
			total= sum+rate;
			System.out.println(sum+"입금"+rate+"이자"+"합계"+total);
		}
		return sum;
	}
	public double withlMoney(double money) {
		double sum = this.money + money;
		double accout = 0;
		double margin = sum+money-this.money;
		accout = margin/2;
		if(sum >= margin) {
			System.out.println(accout+"출금");
		}
		else {
			System.out.println("출금불가");
		}
		return margin;
	} 
	public double marginMoney(double money) {
		double sum = this.money + money;
		double margin = sum + money-this.money; 
		margin = sum - margin;
		if(margin >= 0) {			
			System.out.println(margin+"남은금액");
		}
		else {
			System.out.println("금액이 적음");
		}
		return margin;
	} 
}
