package shopping;

import java.util.List;

public class UserVO {
	
	private int userNo; //����� ��ȣ
	private int point; //����� ����Ʈ
	private String userName; //����� �̸�
	private String visitAt; //�ֱ� �湮 ��¥
	private boolean isSleeper; //�޸���� ���� (true: �޸� , false : �޸� �ƴ�)
	private List<ProductVO> list; //������ ��ǰ (���� �̷�)
	
	public UserVO(int userNo, int point, String userName, String visitAt){
		this.point = point;
		this.userNo = userNo;
		this.userName = userName;
		this.visitAt = visitAt;
	}
	
	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public List<ProductVO> getList() {
		return list;
	}
	public void setList(List<ProductVO> list) {
		this.list = list;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public boolean isSleeper() {
		return isSleeper;
	}
	public void setSleeper(boolean isSleeper) {
		this.isSleeper = isSleeper;
	}
	public String getVisitAt() {
		return visitAt;
	}
	public void setVisitAt(String visitAt) {
		this.visitAt = visitAt;
	}

}
