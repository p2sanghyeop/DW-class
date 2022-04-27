package test;

import java.util.ArrayList;
import java.util.List;

class FruitVO{
	private String fruitName;

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
}
class FruitService{
	public FruitVO getFruit(List<FruitVO>list, String fruitName) {
		for(FruitVO fruit : list) {
			if(fruit.getFruitName().equals(fruitName)) {
				System.out.println(fruit.getFruitName());
			}
		}
		return null;
	}
}
public class �������4 {
	public static void main(String[] args) {
		List<FruitVO> list = new ArrayList<FruitVO>();
		FruitVO a = new FruitVO();
		a.setFruitName("����");
		list.add(a);
		FruitVO b = new FruitVO();
		b.setFruitName("����");
		list.add(b);
		FruitVO c = new FruitVO();
		c.setFruitName("����");
		list.add(c);
		
		FruitService s = new FruitService();
		s.getFruit(list, "����");
	}
}
