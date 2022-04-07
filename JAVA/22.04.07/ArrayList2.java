package 컬렉션즈;

import java.util.ArrayList;

class Student{
	String name;
	int age;
	String addr;
	
	public Student() {//기본생성자
		
	}
	public Student(String name, int age, String addr) {
		this.name = name;
		this.age= age;
		this.addr = addr;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age=age;
	}
}

public class ArrayList2 {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동",26,"부산");
		Student s2 = new Student("고길동",30,"서울");
		ArrayList<Student> list = new ArrayList();
		ArrayList<Student> list2 = new ArrayList();
		list.add(s1);//student 클래스 추가
		String name = list.get(0).name; //student 클래스 필드변수 불러옴
		System.out.println(name);
		int age =  list.get(0).age;
		String addr =  list.get(0).addr;
		System.out.println(age+addr);
		int age2 = list.get(0).getAge();//student클래스 메소드(함수) 불러옴
		list.get(0).setAge(33);
		age2 = list.get(0).getAge();
		System.out.println(age2);
		
		list2.add(s2);
		String name2 = list2.get(0).name;
		int age3 = list2.get(0).age;
		String addr2 = list2.get(0).addr;
		System.out.println(name2+age3+addr2);
		list.get(0).setAge(21);
		int age4 = list.get(0).getAge();
		System.out.println(age4);
	}

}
