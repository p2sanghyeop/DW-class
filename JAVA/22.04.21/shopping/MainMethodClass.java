package shopping;

import java.util.ArrayList;
import java.util.List;

public class MainMethodClass {
	
	
	public static void main(String[] args) {
		
		List<UserVO> userList = new ArrayList<UserVO>();
		userList.add(new UserVO(110,500,"BRIAN","2019-07-01 08:14:31"));
		userList.add(new UserVO(1000,500,"ALLEN","2020-03-01 14:30:31"));
		userList.add(new UserVO(120,800,"SANGWON","2021-05-11 18:20:31"));
		userList.add(new UserVO(130,1100,"KING","2022-04-21 09:10:31"));
		userList.add(new UserVO(140,300,"SMITH","2022-04-21 09:00:31"));
		userList.add(new UserVO(150,200,"SCOTT","2022-04-21 09:20:31"));
		userList.add(new UserVO(160,900,"WILLSON","2022-04-21 09:17:31"));
		userList.add(new UserVO(50,770,"SAM","2022-04-21 10:57:00"));
		
		ShoppingService service = new ShoppingService();
		//1. ȸ�� �� ����Ʈ�� ���� ���� ȸ�� ���� ��ȸ.(��, �ߺ������ʹ� ���ٰ� ����)
		service.getUserList(userList);
		//2. ȸ�� �� �ձ��ڿ� S�� �� ȸ�� ���� ��ȸ.
		service.getFindByName(userList, null);
		//3. ���糯¥ �������� 90�ϵ��� �湮 ������ ȸ�� �޸� �������� ����.
		service.updateNotSleeperToSleeper(userList, 90);
		//4. �޸հ��� �ο� �� ��ȸ.
		service.getSleeperUserCount(userList);
		//5. �޸հ����� �ƴ� ȸ������ 100����Ʈ �߰� ����.
		service.getPointRankerUser(userList);
		//6. ����Ʈ�� ���� ���� ȸ�� ��ȸ.(��, �ߺ������ʹ� ���ٰ� ����)
		service.updatePoint(userList, 0);
		//7. Ư�� ȸ������ ��ǰ���� �߻�.
	    //   ������ ��ǰ�� ���� 5%�� ����Ʈ�� ����.
		 ProductVO p = new  ProductVO();
		 p.setPrice(70000);
		 p.setProductName("���ٵ�����ġ");
		service.getPurchaseRankerUser(userList, p, 130);
		//8. �����̷��� �ִ� ȸ���� ��ȸ.
		for(int i=0; i<userList.size(); ++i) {
			if(userList.get(i).getList() == null) {
				System.out.println(userList.get(i).getUserName()+userList.get(i).getUserNo());
			}
		}
	}
}
