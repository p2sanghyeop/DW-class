package �÷�����;

import java.util.ArrayList;

public class EmpMain {

	public static ArrayList<EmpVO> getEmpList(ArrayList<EmpVO> list){//EmpVO�� ����ִ� ArrayList�� �Ķ���ͷ� �ް� �ִ�.
		for(int i=0; i<list.size(); ++i) {
			System.out.println(list.get(i).empno);
			System.out.println(list.get(i).ename);
		}
		return null;
	}
	
	public static String getValue(String name) {
		System.out.println("���� �̸���"+name);
		return name;
	}
	public static void main(String[] args) {
		String name = "������";
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
//		//�����ȣ, �̸����	
//			System.out.println(list.get(i).empno);
//			System.out.println(list.get(i).ename);
//		}
//		//�޿��� 1300�޷� �̻��� �޴� ����� �̸��� ������ȸ
//		for(int i=0; i<list.size(); ++i) {
//			if(list.get(i).sal>1300) {
//				System.out.println("����2 "+list.get(i).empno);
//				System.out.println("����2 "+list.get(i).job);
//			}
//			}
//			
//		//������ ��������� ����� �޿��� 1400�̻�޴� ��� ��ȣ, �̸� ��ȸ
//		for(int i=0; i<list.size(); ++i) {//�ڹٿ��� ==�� ���ڸ� ���Ҷ� ����ϸ� �ȵ�
//			if(list.get(i).job.equals("SALESMAN") && list.get(i).sal>=1400) {
//				System.out.println("����3 "+list.get(i).empno);
//				System.out.println("����3 "+list.get(i).ename);
//			}
//			}
//		//�Ի�⵵�� 1981�⵵�� ����� ��ȣ �̸� ��ȸ	
//		for(int i=0; i<list.size(); ++i) {
//			if(list.get(i).hiredate.split("-")[0].equals("1981")) {
//				System.out.println("����4 "+list.get(i).empno+" "+list.get(i).ename);
//			}
//		}
//		//������ �Ŵ����� ����� ��ȸ
//		int count = 0;
//		for(int i=0; i<list.size(); ++i) {
//			if(list.get(i).job.equals("MANAGER")) {
//				++count;
//			}
//		}
//		System.out.println("����5 "+count);
//		//����� �޿��� ���� ���� �޴� ����� ��ȣ,�̸�,�Ի�⵵ ��ȸ
//		int max=0;
//		int temp = 0;
//		for(int i=0; i<list.size(); ++i) {
//			if (list.get(i).sal>max) {
//				max=list.get(i).sal;
//			temp = i;	
//			}	
//		}
//		
//		System.out.println("����6"+" "+list.get(temp).empno+" "+list.get(temp).ename+" "+list.get(temp).hiredate);			
//		//�μ���ȣ�� �� ��ȸ ex) 20: 2��, 30: 3��
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
//		System.out.println("����7 "+deptno20);
//		System.out.println("����7 "+deptno30);
//		//�Ի���� 02���� ����� ��ȸ
//		int total = 0;
//		for(int i=0; i<list.size(); ++i) {
//			if(list.get(i).hiredate.split("-")[1].equals("02")) {
//				++total;
//			}
//		}
//		System.out.println("����8 "+ total);
//		//comm�� ���� ��� ���� ����,�̸��� ��ȸ�Ͻÿ�.
//		int com = 0;
//		for(int i=0; i<list.size(); ++i) {
//			if(list.get(i).comm != 0) {
//				++com;
//				System.out.println("���� �߰� 1 "+list.get(i).job+" "+list.get(i).ename+" "+com);
//			}
//		}
//		//emp�� �ִ� �޿� ����� ���Ͻÿ�.
//		int sum = 0; 
//		int avg = 0;
//		for (int i=0; i<list.size(); ++i) {
//			sum += list.get(i).sal;
//		}
//		avg = sum/list.size();
//		System.out.println("���� �߰� 2 "+avg);
//		//�����ȣ�� 7844, 7876�� ������� comm 200�� �����Ͻÿ�.
//		for (int i=0; i<list.size(); ++i) {
//			if(list.get(i).empno == 7844 || list.get(i).empno ==7876) {
//				list.get(i).comm = 200;
//			}
//			System.out.println("���� �߰� 3 "+list.get(i).comm);
//		}
//		//����̸��� null�� ����̸��� '������ ����' ���� �����Ͻÿ�. 
//		for (int i=0; i<list.size(); ++i) {
//			if(list.get(i).ename == null) {
//				list.get(i).ename = "������ ����";
//			}
//			System.out.println("���� �߰� 4 "+list.get(i).ename);
//		}
//		//20�� �μ��� ���� ������ ���� �ʽ��ϴ�. 20���μ��� ��� �ذ�(����) �Ͻʽÿ�.
//		for (int i=0; i<list.size(); ++i) {
//			if(list.get(i).deptno ==20) {
//				list.remove(i);
//			}
//			System.out.println("��ü �߰� 5 "+list.get(i).deptno);
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
