package test;

import java.util.ArrayList;
import java.util.List;

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
}
class MemberService{
	public List<MemberVO> getMemberList(List<MemberVO> list){
		
//		for(MemberVO vo : list) {
//			String memberNo = vo.getMemberNo();
//			if(memberNo.equals("200")){
//				int sal = vo.getSal();
//				sal = sal+(int)(sal*MemberCode.BONUS);
//				
//				vo.setSal(sal);
//			}
//		}
		for(int i=0; i<list.size(); ++i) {
			String memberNo = list.get(i).getMemberNo();
			if(memberNo.equals("200")){
				int sal = list.get(i).getSal();
				sal = sal+(int)(sal*MemberCode.BONUS);
				
				list.get(i).setSal(sal);
		}
		return list;
	}
}
}
public class 점검9답안 {

	public static void main(String[] args) {
		//리턴타입하고 메소드확인
		//1.번호,급여 추가
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
		list = s.getMemberList(list);
		
		for(MemberVO vo : list) {
		 System.out.println("사원번호"+vo.getMemberNo()+"사원급여"+vo.getSal());
		}
	}

}
