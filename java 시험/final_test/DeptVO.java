package final_test;

public class DeptVO {
	private int deptno; //�μ���ȣ
	private String dname; //�μ��̸�
	
	public DeptVO(int deptno, String dname) {
		this.deptno = deptno;
		this.dname = dname;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
}
