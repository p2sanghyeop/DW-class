package final_test;

import java.util.List;

public interface EmpServiceImpl {
	/**
	 * @param list
	 * @return List<EmpVO>
	 * @date : 2022. 4. 28.
	 * @author : sangwon Hyun
	 * comment : 1��. ��ü ��� 200�޷� �޿� �λ��ϰ� ��� ����Ʈ�� ���� �Ͻÿ�. 
	 */
	public List<EmpVO> getEmpList(List<EmpVO> list);
	
	/**
	 * @param list
	 * @return EmpVO
	 * @date : 2022. 4. 28.
	 * @author : sangwon Hyun
	 * comment : 2��. �޿��� ���� ���� ����� ���� �Ͻÿ�. (��, �޿� �ߺ��� ���ٰ� ����)
	 */
	public EmpVO getEmp(List<EmpVO> list);
	
	
	/**
	 * @param list
	 * @param sal
	 * @return int
	 * @date : 2022. 4. 28.
	 * @author : sangwon Hyun
	 * comment : 3��. ��� �� �޿��� 300���Ϸ� �ް� �ִ� ��� ���� ���Ͻÿ�.
	 */
	public int getCount(List<EmpVO> list, int sal);
	
	/**
	 * @param vo
	 * @return EmpVO
	 * @date : 2022. 4. 28.
	 * @author : sangwon Hyun
	 * comment : 4��. Ư�� ����� �μ���ȣ 10, �μ��̸� SALES �μ��� �߰��ϰ� ����� �����Ͻÿ�.
	 */
	public EmpVO setDept(EmpVO empVO);
}
