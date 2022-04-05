package 상속;

public class Home {

	public static void main(String[] args) {
		Dw dw = new Dw("고길동", "반응형", 17);//인스턴스화 하다(파일을 불러오다)
//		dw.setName("홍길동");
//		dw.setClassName("DW아카데미");
//		dw.setStudentCount(13);
		//name, className, studentCoutn 무조건 set을 해야하는 이슈
		Dw dw05 = new Dw("고길동", "멀티플랫폼개발",30);
		String name = dw.getName();
		System.out.println("학생이름"+name);
		String ac = dw.getClassName();
		System.out.println("학원이름"+ac);
		int count = dw.getStudentCount();
		System.out.println("학생수"+count);
		
		Dw dw02= null;
		if(dw02 == null) {
			dw02 = new Dw("순신","검술",15);
		}
			int x=0;
			if(x==0) {
				x=10;
			}
	}

}
