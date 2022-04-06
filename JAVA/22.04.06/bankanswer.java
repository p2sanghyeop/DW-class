package 상속;

class Account{
	int deposit;
	int withdraw;
	int totalMoney;
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		if(deposit<=500000) {	
			this.deposit += deposit;//총 입금 금액
			System.out.println("입금금액 =>"+deposit+"원");
			this.totalMoney += deposit;//내 통장 잔고
		}
		else {
		System.out.println("입금 과다");
		}
	}
	public int getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(int withdraw) {
		if(this.totalMoney<withdraw){
			System.out.println("출금불가");
		}
		else {			
			this.withdraw += withdraw;
			System.out.println("출금금액은 =>"+withdraw+"원");
			this.totalMoney -= withdraw;
		}
		
	}
	public int getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(int interest) {
		this.totalMoney += interest;
	}
}

public class bankanswer {
	
	public static double paidInterenstOnAccount(int money){
		final double INTEREST_RATE = 0.1;
		return money * INTEREST_RATE;
	}
	
	public static void main(String[] args) {

		Account account = new Account();
		account.setDeposit(1000);
		if(account.getTotalMoney() >0) {
			System.out.println("현재잔고 =>"+account.getTotalMoney()+"원");
			account.setWithdraw(500);
			System.out.println("현재잔고 =>"+account.getTotalMoney()+"원");
			account.setDeposit(500000);//월급
			System.out.println("현재잔고 =>"+account.getTotalMoney()+"원");
			account.setDeposit(500000);//보너스
			System.out.println("현재잔고 =>"+account.getTotalMoney()+"원");
			account.setDeposit(500000);//야근
			System.out.println("현재잔고 =>"+account.getTotalMoney()+"원");
			int myMoney = account.getTotalMoney();
			if(myMoney>=1000000) {//입금후 잔액이 백만원 이상
				int interestMoney = (int)paidInterenstOnAccount(myMoney);
				System.out.println("이자 =>"+interestMoney);
				account.setTotalMoney(interestMoney);
				System.out.println("현재잔고 =>"+account.getTotalMoney()+"원");
			}
			
		}
	}

}
