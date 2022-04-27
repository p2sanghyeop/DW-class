package test;

import java.util.ArrayList;
import java.util.List;

import 추상화.ServiceImple;

class MemberVO{
	private String memberNo;
	private int sal;
	
	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
}
class MemberCode{
	public static final double BONUS = 0.1;
	public static final int MAX_VALUE = 300;
}
class MemberService implements MemberServiceImpl {
	@Override
	public List<MemberVO> getMemberList(List<MemberVO> list){
		MemberCode d = new MemberCode();
		int sal = 0;
		for(MemberVO vo : list) {
			if(vo.getMemberNo().equals("200")) {
				double bonus = vo.getSal()*d.BONUS;
				 sal = vo.getSal()+(int)bonus;
				 vo.setSal(sal);
			}
			System.out.println("번호"+vo.getMemberNo()+"급여"+vo.getSal());
		}
		
		return list;
	}
	@Override
	public String getMemberNo(List<MemberVO> list) {
		for(int i=0; i<list.size(); ++i) {
			if(list.get(i).getSal()>=300) {
				return list.get(i).getMemberNo();
			}
		}
		return null;
	}
}


public class 긴급점검9 {

	public static void main(String[] args) {
		
		List<MemberVO> list = new ArrayList<MemberVO>();
		MemberVO a = new MemberVO();
		a.setMemberNo("100");
		a.setSal(100);
		list.add(a);
		MemberVO b = new MemberVO();
		b.setMemberNo("200");
		b.setSal(200);
		list.add(b);
		MemberVO c = new MemberVO();
		c.setMemberNo("300");
		c.setSal(300);
		list.add(c);
		
		MemberService s = new MemberService();
		s.getMemberList(list);
		System.out.println(s.getMemberNo(list));
	}

}
