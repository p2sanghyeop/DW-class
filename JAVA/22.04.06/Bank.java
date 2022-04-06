package »ó¼Ó;

public class Bank {

	public static void main(String[] args) {
		
		Business manage = new Business();
		double saving = manage.sumMoney(1000000);
		if(saving >0) {
			double paying = manage.withlMoney(1000000);	

			double balance = manage.marginMoney(200000);
		}	
	}

}
