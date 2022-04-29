package final_test;

import java.util.ArrayList;
import java.util.List;


public class EmpMain {

	public static void main(String[] args) {
		
		List<EmpVO> list = new ArrayList<EmpVO>();
		list.add(new EmpVO(100, "ALLEN", 100));
		list.add(new EmpVO(110, "SMITH", 100));
		list.add(new EmpVO(120, "WILLSON", 200));
		list.add(new EmpVO(130, "SANGWON", 50));
		list.add(new EmpVO(140, "BRIAN", 600));
		list.add(new EmpVO(150, "KING", 3000));

		EmpServiceImpl service = new EmpService();
		//1��. ��ü ��� 200�޷� �޿� �λ��ϰ� ��� ����Ʈ�� ���� �Ͻÿ�.
		service.getEmpList(list);
		//2��. �޿��� ���� ���� ����� ���� �Ͻÿ�. (��, �޿� �ߺ��� ���ٰ� ����)
		service.getEmp(list);
		//3��. ��� �� �޿��� 300���Ϸ� �ް� �ִ� ��� ���� ���Ͻÿ�.
		service.getCount(list, 300);
		//4��. Ư�� ����� �μ���ȣ 10, �μ��̸� SALES �μ��� �߰��ϰ� ����� �����Ͻÿ�.
		service.setDept(null);
		
	}

}
