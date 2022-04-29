package final_test;

import java.util.ArrayList;
import java.util.List;


public class EmpService implements EmpServiceImpl{

	@Override
	public List<EmpVO> getEmpList(List<EmpVO> list) {
		//1번. 전체 사원 200달러 급여 인상하고 사원 리스트를 리턴 하시오. 
		for(int i=0; i<list.size(); ++i) {
			list.get(i).setSal(list.get(i).getSal()+200);
			System.out.println("직원급여"+list.get(i).getSal());
		}
		return list;
	}

	@Override
	public EmpVO getEmp(List<EmpVO> list) {
		//2번. 급여가 가장 높은 사원을 리턴 하시오. (단, 급여 중복이 없다고 가정)
		int max=0;
		int temp=0;
		for(int i=0; i<list.size(); ++i) {
			if(list.get(i).getSal()>max) {
				max=list.get(i).getSal();
				temp=i;
			}
		}
		System.out.println("최고급여"+list.get(temp).getSal());
		return null;
	}

	@Override
	public int getCount(List<EmpVO> list, int sal) {
		//3번. 사원 중 급여를 300이하로 받고 있는 사원 수를 구하시오.
		int count =0;
		for(int i=0; i<list.size(); ++i) {
			if(list.get(i).getSal() <= sal) {
				++count;
			}
		}
		System.out.println("300 이하 인원"+count);
		return 0;
	}

	@Override
	public EmpVO setDept(EmpVO empVO) {
		//4번. 특정 사원에 부서번호 10, 부서이름 SALES 부서를 추가하고 사원을 리턴하시오.
		DeptVO vo = new DeptVO(10, "SALES");
		EmpVO vo2 = new EmpVO(150, "KING", 3000);
		ArrayList<DeptVO> list2 = new ArrayList<DeptVO>();
		list2.add(vo);
		vo2.setList(list2);
		for(int i=0; i<list2.size(); ++i) {
			System.out.println("직원번호"+vo2.getEmpno()+"직원이름"+vo2.getEname()+"부서번호"+vo2.getList().get(i).getDeptno()+"부서이름"+vo2.getList().get(i).getDname());
		}
		return vo2;
	}

}