package ���;

class Account{
	int deposit;
	int withdraw;
	int totalMoney;
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		if(deposit<=500000) {	
			this.deposit += deposit;//�� �Ա� �ݾ�
			System.out.println("�Աݱݾ� =>"+deposit+"��");
			this.totalMoney += deposit;//�� ���� �ܰ�
		}
		else {
		System.out.println("�Ա� ����");
		}
	}
	public int getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(int withdraw) {
		if(this.totalMoney<withdraw){
			System.out.println("��ݺҰ�");
		}
		else {			
			this.withdraw += withdraw;
			System.out.println("��ݱݾ��� =>"+withdraw+"��");
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
			System.out.println("�����ܰ� =>"+account.getTotalMoney()+"��");
			account.setWithdraw(500);
			System.out.println("�����ܰ� =>"+account.getTotalMoney()+"��");
			account.setDeposit(500000);//����
			System.out.println("�����ܰ� =>"+account.getTotalMoney()+"��");
			account.setDeposit(500000);//���ʽ�
			System.out.println("�����ܰ� =>"+account.getTotalMoney()+"��");
			account.setDeposit(500000);//�߱�
			System.out.println("�����ܰ� =>"+account.getTotalMoney()+"��");
			int myMoney = account.getTotalMoney();
			if(myMoney>=1000000) {//�Ա��� �ܾ��� �鸸�� �̻�
				int interestMoney = (int)paidInterenstOnAccount(myMoney);
				System.out.println("���� =>"+interestMoney);
				account.setTotalMoney(interestMoney);
				System.out.println("�����ܰ� =>"+account.getTotalMoney()+"��");
			}
			
		}
	}

}
