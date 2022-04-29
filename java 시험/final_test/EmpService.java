package final_test;

import java.util.ArrayList;
import java.util.List;


public class EmpService implements EmpServiceImpl{

	@Override
	public List<EmpVO> getEmpList(List<EmpVO> list) {
		//1��. ��ü ��� 200�޷� �޿� �λ��ϰ� ��� ����Ʈ�� ���� �Ͻÿ�. 
		for(int i=0; i<list.size(); ++i) {
			list.get(i).setSal(list.get(i).getSal()+200);
			System.out.println("�����޿�"+list.get(i).getSal());
		}
		return list;
	}

	@Override
	public EmpVO getEmp(List<EmpVO> list) {
		//2��. �޿��� ���� ���� ����� ���� �Ͻÿ�. (��, �޿� �ߺ��� ���ٰ� ����)
		int max=0;
		int temp=0;
		for(int i=0; i<list.size(); ++i) {
			if(list.get(i).getSal()>max) {
				max=list.get(i).getSal();
				temp=i;
			}
		}
		System.out.println("�ְ�޿�"+list.get(temp).getSal());
		return null;
	}

	@Override
	public int getCount(List<EmpVO> list, int sal) {
		//3��. ��� �� �޿��� 300���Ϸ� �ް� �ִ� ��� ���� ���Ͻÿ�.
		int count =0;
		for(int i=0; i<list.size(); ++i) {
			if(list.get(i).getSal() <= sal) {
				++count;
			}
		}
		System.out.println("300 ���� �ο�"+count);
		return 0;
	}

	@Override
	public EmpVO setDept(EmpVO empVO) {
		//4��. Ư�� ����� �μ���ȣ 10, �μ��̸� SALES �μ��� �߰��ϰ� ����� �����Ͻÿ�.
		DeptVO vo = new DeptVO(10, "SALES");
		EmpVO vo2 = new EmpVO(150, "KING", 3000);
		ArrayList<DeptVO> list2 = new ArrayList<DeptVO>();
		list2.add(vo);
		vo2.setList(list2);
		for(int i=0; i<list2.size(); ++i) {
			System.out.println("������ȣ"+vo2.getEmpno()+"�����̸�"+vo2.getEname()+"�μ���ȣ"+vo2.getList().get(i).getDeptno()+"�μ��̸�"+vo2.getList().get(i).getDname());
		}
		return vo2;
	}

}