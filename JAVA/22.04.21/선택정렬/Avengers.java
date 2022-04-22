package 선택정렬;

import java.util.ArrayList;
import java.util.List;

class Members{
	private String name;
	private List<String> stone;

	public List<String> getStone() {
		return stone;
	}

	public void setStone(List<String> stone) {
		this.stone = stone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
public class Avengers {
	
	public static Members printMemberName(Members member) {
		if(member == null) {
			member = new Members();
		}
		member.setName("토르");
		List<String> list = new ArrayList<String>();
		list.add("파워스톤");
		member.setStone(list);
		return member;
	}
	
	public static void main(String[] args) {
		Members m = new Members();
		m.setName("토르");
		String name = m.getName();
		System.out.println(name);
		Members m2 = new Members();//m과 m2를 분리해주고 싶을때 new를 쓴다
		//m2 =m 이라고하면 m과 m2는 같은게 된다
		String name2 = m2.getName();
		System.out.println(name2);//class 의 초기값은 null이다
		//방법1
		printMemberName(m);
		//방법2
		printMemberName(new Members());
		//방법3
//		Members m3=null;
		Members m3 = new Members(); 
		printMemberName(m3);
		System.out.println(m3);
		String powerStone = m3.getStone().get(0);
		System.out.println(powerStone);
	}

}
