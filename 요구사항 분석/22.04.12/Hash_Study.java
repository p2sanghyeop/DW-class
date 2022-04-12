package 컬렉션즈;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class OneSoju{
	
}
public class Hash_Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		list2 = new LinkedList<String>();
		HashMap<String,Object> map = new HashMap<String,Object>();
		Map<String,Object> map2 = new HashMap<String,Object>();
		//value에 Object를 쓰면 숫자도 사용가능
		
		OneSoju onesoju = new OneSoju();
		
		map.put("1","참이슬");//hashmap에 데이터 넣기
		map.put("2","처음처럼");
		map.put("a", "한라산");
		map.put("b",13);
		System.out.println(map.get("1"));//key이름으로 value 접근
		System.out.println(map.get("a"));
	}

}
