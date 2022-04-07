package 컬렉션즈;

import java.util.ArrayList;

public class EmpMain {

	public static ArrayList<EmpVO> getEmpList(ArrayList<EmpVO> list){//EmpVO를 담고있는 ArrayList를 파라미터로 받고 있다.
		for(int i=0; i<list.size(); ++i) {
			System.out.println(list.get(i).empno);
			System.out.println(list.get(i).ename);
		}
		return null;
	}
	
	public static String getValue(String name) {
		System.out.println("너의 이름은"+name);
		return name;
	}
	public static void main(String[] args) {
		String name = "아이유";
		String result = getValue(name);
	}
//	public static void main(String[] args) {
//		
//		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
//		list.add(new EmpVO(7369,"SMITH","CLERK","1980-12-17",800,20,0));
//		list.add(new EmpVO(7499,"ALLEN","SALESMAN","1981-02-20",1600,30,300));
//		list.add(new EmpVO(7521,"WARD","SALESMAN","1981-02-22",1250,30,500));
//		list.add(new EmpVO(7566,"JONES","MANAGER","1981-04-02",2975,20,0));
//		list.add(new EmpVO(7654,"MARTIN","SALESMAN","1981-09-28",1250,30,1400));
//		list.add(new EmpVO(7698,"BLAKE","MANAGER","1981-05-01",2850,30,0));
//		list.add(new EmpVO(7782,"CLARK","MANAGER","1981-06-09",2450,10,0));
//		list.add(new EmpVO(7788,"SCOTT","ANALYST","1987-06-28",3000,20,0));
//		list.add(new EmpVO(7839,"KING","PRESIDENT","1981-11-17",5000,10,0));
//		list.add(new EmpVO(7844,"TURNER","SALESMAN","1981-09-08",1500,30,0));
//		list.add(new EmpVO(7876,"ADAMS","CLERK","1987-07-13",1100,20,0));
//		list.add(new EmpVO(7900,"JAMES","CLERK","1981-12-03",950,30,0));
//		list.add(new EmpVO(7902,"FORD","ANALYST","1981-12-03",3000,20,0));
//		list.add(new EmpVO(7934,null,"CLERK","1982-01-23",1300,10,0));		//for
//		
//		getEmpList(list);
//		
//		
//		
//		
//		for(int i=0; i<list.size(); ++i) {
//		//사원번호, 이름출력	
//			System.out.println(list.get(i).empno);
//			System.out.println(list.get(i).ename);
//		}
//		//급여가 1300달러 이상을 받는 사원의 이름과 직업조회
//		for(int i=0; i<list.size(); ++i) {
//			if(list.get(i).sal>1300) {
//				System.out.println("문제2 "+list.get(i).empno);
//				System.out.println("문제2 "+list.get(i).job);
//			}
//			}
//			
//		//직업이 세일즈맨인 사원중 급여가 1400이상받는 사원 번호, 이름 조회
//		for(int i=0; i<list.size(); ++i) {//자바에서 ==는 문자를 비교할때 사용하면 안됨
//			if(list.get(i).job.equals("SALESMAN") && list.get(i).sal>=1400) {
//				System.out.println("문제3 "+list.get(i).empno);
//				System.out.println("문제3 "+list.get(i).ename);
//			}
//			}
//		//입사년도가 1981년도인 사원의 번호 이름 조회	
//		for(int i=0; i<list.size(); ++i) {
//			if(list.get(i).hiredate.split("-")[0].equals("1981")) {
//				System.out.println("문제4 "+list.get(i).empno+" "+list.get(i).ename);
//			}
//		}
//		//직업이 매니저인 사원수 조회
//		int count = 0;
//		for(int i=0; i<list.size(); ++i) {
//			if(list.get(i).job.equals("MANAGER")) {
//				++count;
//			}
//		}
//		System.out.println("문제5 "+count);
//		//사원중 급여를 가장 많이 받는 사원의 번호,이름,입사년도 조회
//		int max=0;
//		int temp = 0;
//		for(int i=0; i<list.size(); ++i) {
//			if (list.get(i).sal>max) {
//				max=list.get(i).sal;
//			temp = i;	
//			}	
//		}
//		
//		System.out.println("문제6"+" "+list.get(temp).empno+" "+list.get(temp).ename+" "+list.get(temp).hiredate);			
//		//부서번호별 수 조회 ex) 20: 2명, 30: 3명
//		int deptno20 = 0;
//		int deptno30 = 0;
//		for(int i=0; i<list.size(); ++i) {
//			if(list.get(i).deptno == 20) {
//				++deptno20;
//			}
//			if(list.get(i).deptno == 30) {
//				++deptno30;
//			}
//		}
//		System.out.println("문제7 "+deptno20);
//		System.out.println("문제7 "+deptno30);
//		//입사월이 02월인 사원수 조회
//		int total = 0;
//		for(int i=0; i<list.size(); ++i) {
//			if(list.get(i).hiredate.split("-")[1].equals("02")) {
//				++total;
//			}
//		}
//		System.out.println("문제8 "+ total);
//		//comm을 받은 사원 수와 직업,이름을 조회하시오.
//		int com = 0;
//		for(int i=0; i<list.size(); ++i) {
//			if(list.get(i).comm != 0) {
//				++com;
//				System.out.println("문제 추가 1 "+list.get(i).job+" "+list.get(i).ename+" "+com);
//			}
//		}
//		//emp에 있는 급여 평균을 구하시오.
//		int sum = 0; 
//		int avg = 0;
//		for (int i=0; i<list.size(); ++i) {
//			sum += list.get(i).sal;
//		}
//		avg = sum/list.size();
//		System.out.println("문제 추가 2 "+avg);
//		//사원번호가 7844, 7876인 사원에게 comm 200을 지급하시오.
//		for (int i=0; i<list.size(); ++i) {
//			if(list.get(i).empno == 7844 || list.get(i).empno ==7876) {
//				list.get(i).comm = 200;
//			}
//			System.out.println("문제 추가 3 "+list.get(i).comm);
//		}
//		//사원이름이 null인 사원이름에 '데이터 없음' 으로 수정하시오. 
//		for (int i=0; i<list.size(); ++i) {
//			if(list.get(i).ename == null) {
//				list.get(i).ename = "데이터 없음";
//			}
//			System.out.println("문제 추가 4 "+list.get(i).ename);
//		}
//		//20번 부서가 올해 실적이 좋지 않습니다. 20번부서를 모두 해고(제거) 하십시오.
//		for (int i=0; i<list.size(); ++i) {
//			if(list.get(i).deptno ==20) {
//				list.remove(i);
//			}
//			System.out.println("문체 추가 5 "+list.get(i).deptno);
//		}
//		//for each
////		for(EmpVO vo : list) {
////			
////		}
//		
//		
//	}
//
}
