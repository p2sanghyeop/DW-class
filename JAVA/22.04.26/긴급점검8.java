package test;

import java.util.ArrayList;
import java.util.List;

class Chef{
	private int chefAge;

	public int getChefAge() {
		return chefAge;
	}

	public void setChefAge(int chefAge) {
		this.chefAge = chefAge;
	}
}
public class 긴급점검8 {

	public static List<Chef> getChefList(){
		List<Chef> list = new ArrayList<Chef>();
		Chef a = new Chef();
		a.setChefAge(30);
		list.add(a);
		Chef b = new Chef();
		b.setChefAge(40);
		list.add(b);
		Chef c = new Chef();
		c.setChefAge(50);
		list.add(c);
		Chef d = new Chef();
		d.setChefAge(60);
		list.add(d);
		return list;
	}
	
	public static int getChefListCount(List<Chef> list) {
		list = getChefList();
		int count = 0;
		for(Chef chef : list) {
			if(chef.getChefAge()>=50) {
				++count;
			}
		}
		System.out.println(count);
		return 0;
	}
	
	public static void main(String[] args) {
		getChefListCount(getChefList());
	}

}
