package 컬렉션즈;

import java.util.ArrayList;

public class ArrayList_Study {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();//()생성자
		//<> : 제네릭
		//add : 데이터를 list에 삽입
		//list에 저장된 곱창 파스타
		list.add("시금치 파스타");
		list.add("곱창 파스타");
		list.add("곱창 파스타");
		list.add("곱창 파스타");
		list.add("곱창 파스타");
		
		int len = list.size();//list길이 호출
		System.out.println("list 길이 -> "+len);
		
		String value = list.get(0);
		System.out.println(value);
		String value1 = list.get(1);
		System.out.println(value1);
		
		int count=0;
		for(int i=0; i<len; ++i) {
			String value3 = list.get(i);
			System.out.println(value3);
			if(value3.equals("곱창 파스타")) {
				++count;
			}
		}
		System.out.println(count);
		
		//int를 담는 ArrayList
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(40);
		list2.add(60);
		list2.add(80);
		list2.add(30);
		//list에 추가된 숫자 총합구하기
		int sum = 0;
		for(int i=0; i<list2.size(); ++i) {
			if(list2.get(i) != 40) {
			sum += list2.get(i);
			}
		}
		System.out.println(sum);
		
		
		
		
		
		int []array = {0};//int형 배열
	}
}
