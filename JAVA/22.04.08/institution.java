package ���;


class money{
	int deposit;
	int withdraw;
	int totalMoney;
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit += deposit;
		System.out.println("�Աݱݾ� =>"+deposit+"��");
		this.totalMoney += deposit;
	}
	public int getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(int withdraw) {
		if(this.totalMoney<withdraw) {
			System.out.println("��ݺҰ�");
		}
		else {
			this.withdraw = withdraw;
			System.out.println("��ݱݾ��� =>"+withdraw+"��");
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
			System.out.println("�����ܰ� =>"+m.getTotalMoney()+"��");
			m.setWithdraw(500);
			System.out.println("�����ܰ� =>"+m.getTotalMoney()+"��");
			m.setDeposit(500000);//����
			System.out.println("�����ܰ� =>"+m.getTotalMoney()+"��");
			m.setDeposit(500000);//���ʽ�
			System.out.println("�����ܰ� =>"+m.getTotalMoney()+"��");
			m.setDeposit(500000);//�߱�
			System.out.println("�����ܰ� =>"+m.getTotalMoney()+"��");
			int tm = m.getTotalMoney();
			if(tm>1000000) {
				int interestMoney = (int)paidInterest(tm);
				System.out.println("���� =>"+interestMoney);
				m.setTotalMoney(interestMoney);
				System.out.println("�����ܰ� =>"+m.getTotalMoney()+"��");
			}
		}
	}

}
