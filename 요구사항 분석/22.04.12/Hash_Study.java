package �÷�����;

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
		//value�� Object�� ���� ���ڵ� ��밡��
		
		OneSoju onesoju = new OneSoju();
		
		map.put("1","���̽�");//hashmap�� ������ �ֱ�
		map.put("2","ó��ó��");
		map.put("a", "�Ѷ��");
		map.put("b",13);
		System.out.println(map.get("1"));//key�̸����� value ����
		System.out.println(map.get("a"));
	}

}
