package 상속;


class money{
	int deposit;
	int withdraw;
	int totalMoney;
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit += deposit;
		System.out.println("입금금액 =>"+deposit+"원");
		this.totalMoney += deposit;
	}
	public int getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(int withdraw) {
		if(this.totalMoney<withdraw) {
			System.out.println("출금불가");
		}
		else {
			this.withdraw = withdraw;
			System.out.println("출금금액은 =>"+withdraw+"원");
			this.totalMoney=this.totalMoney - this.withdraw;
		}
	}
	public int getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(int interest) {
		this.totalMoney += interest;
	}
}

public class institution {
	
	public static double paidInterest(int money) {	
		double interest_rate = 0.1;
		return money*interest_rate;
	}
	
	public static void main(String[] args) {
		
		money m = new money();
		m.setDeposit(1000);
		if(m.getTotalMoney() >0) {
			System.out.println("현재잔고 =>"+m.getTotalMoney()+"원");
			m.setWithdraw(500);
			System.out.println("현재잔고 =>"+m.getTotalMoney()+"원");
			m.setDeposit(500000);//월급
			System.out.println("현재잔고 =>"+m.getTotalMoney()+"원");
			m.setDeposit(500000);//보너스
			System.out.println("현재잔고 =>"+m.getTotalMoney()+"원");
			m.setDeposit(500000);//야근
			System.out.println("현재잔고 =>"+m.getTotalMoney()+"원");
			int tm = m.getTotalMoney();
			if(tm>1000000) {
				int interestMoney = (int)paidInterest(tm);
				System.out.println("이자 =>"+interestMoney);
				m.setTotalMoney(interestMoney);
				System.out.println("현재잔고 =>"+m.getTotalMoney()+"원");
			}
		}
	}

}
