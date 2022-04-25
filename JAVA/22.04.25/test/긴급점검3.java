package test;

import java.util.ArrayList;
import java.util.List;

import 컬렉션즈.EmpVO;

class Singer{
	public String SingerName; //가수 이름
	public Singer(String singerName) {
		this.SingerName = singerName;
	}
}


public class 긴급점검3 {
	
	public static List<Singer> getListSinger(){
		ArrayList<Singer> list = new ArrayList<Singer>();
		list.add(new Singer("김종국"));
		list.add(new Singer("서인국"));
		list.add(new Singer("방용국"));
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
//		list.add(new Singer("김종국"));
//		list.add(new Singer("서인국"));
//		list.add(new Singer("방용국"));
//		for(int i=0; i<list.size(); ++i) {
//			if(list.get(i).SingerName.equals("김종국")) {
//				System.out.println(list.get(i).SingerName);
//			}
//		}
		Singer s = new Singer("김종국");
		return s;
	}
	
	public static void main(String[] args) {
		ArrayList<Singer> list = new ArrayList<Singer>();
		list.add(new Singer("김종국"));
		list.add(new Singer("서인국"));
		list.add(new Singer("방용국"));
		Singer s = new Singer("김종국");
		//1. getListSinger()이용해서 김종국, 서인국, 방용국 list 출력!
		for(int i=0;i<getListSinger().size();++i) {
			System.out.println("1번"+getListSinger().get(i).SingerName);
		}
		//2. getSinger()이용해서 김종국만 출력!
		System.out.println("2번"+getSinger().SingerName);
		getListSinger(list);
		String name = getSinger(s).SingerName;
		System.out.println(name);
	}
}
