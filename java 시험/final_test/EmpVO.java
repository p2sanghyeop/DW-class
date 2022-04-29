package final_test;

import java.util.List;

public class EmpVO {
	
	private int empno; //�����ȣ
	private String ename; //����̸�
	private int sal; //����޿�
	private List<DeptVO> list; //����μ�
	
	public EmpVO(int empno, String ename, int sal) {
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}
	
	public List<DeptVO> getList() {
		return list;
	}
	public void setList(List<DeptVO> list) {
		this.list = list;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
}
