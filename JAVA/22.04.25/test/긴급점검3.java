package test;

import java.util.ArrayList;
import java.util.List;

import �÷�����.EmpVO;

class Singer{
	public String SingerName; //���� �̸�
	public Singer(String singerName) {
		this.SingerName = singerName;
	}
}


public class �������3 {
	
	public static List<Singer> getListSinger(){
		ArrayList<Singer> list = new ArrayList<Singer>();
		list.add(new Singer("������"));
		list.add(new Singer("���α�"));
		list.add(new Singer("��뱹"));
//		for(int i=0; i<list.size(); ++i) {
//			System.out.println(list.get(i).SingerName);
//		}
		return list;
	}
	public static List<Singer> getListSinger(List<Singer> list){
		for(int i=0; i<list.size(); ++i) {
			System.out.println(list.get(i).SingerName);
		}
		return list;
	}
	public static Singer getSinger(Singer s){
	
		return s;
	}
	public static Singer getSinger(){
//		ArrayList<Singer> list = new ArrayList<Singer>();
//		list.add(new Singer("������"));
//		list.add(new Singer("���α�"));
//		list.add(new Singer("��뱹"));
//		for(int i=0; i<list.size(); ++i) {
//			if(list.get(i).SingerName.equals("������")) {
//				System.out.println(list.get(i).SingerName);
//			}
//		}
		Singer s = new Singer("������");
		return s;
	}
	
	public static void main(String[] args) {
		ArrayList<Singer> list = new ArrayList<Singer>();
		list.add(new Singer("������"));
		list.add(new Singer("���α�"));
		list.add(new Singer("��뱹"));
		Singer s = new Singer("������");
		//1. getListSinger()�̿��ؼ� ������, ���α�, ��뱹 list ���!
		for(int i=0;i<getListSinger().size();++i) {
			System.out.println("1��"+getListSinger().get(i).SingerName);
		}
		//2. getSinger()�̿��ؼ� �������� ���!
		System.out.println("2��"+getSinger().SingerName);
		getListSinger(list);
		String name = getSinger(s).SingerName;
		System.out.println(name);
	}
}
