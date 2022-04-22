package shopping;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class ShoppingService implements ShoppingServiceImpl {

	@Override
	public List<UserVO> getUserList(List<UserVO> list) {
		int max = 0;
		int temp = 0;
		for(int i=0; i<list.size(); ++i) {
			if(list.get(i).getPoint() > max) {
				max = list.get(i).getPoint();
				temp = i;
			}
		}
		System.out.println("����Ʈ ���� ���� ��� "+list.get(temp).getUserName()+list.get(temp).getUserNo());
		return list;
	}

	@Override
	public List<UserVO> getFindByName(List<UserVO> list, String word) {
		for(int i=0; i< list.size(); ++i) {
			if(list.get(i).getUserName().substring(0, 1).equals("S")) {
				System.out.println("S�� �����ϴ� ��� "+list.get(i).getUserName()+list.get(i).getUserNo());
			}
		}
		return null;
	}

	@Override
	public int getSleeperUserCount(List<UserVO> list) {
		int count = 0;
		for(int i=0; i<list.size(); ++i) {
			if(list.get(i).isSleeper()) {
				++count;
			}
		}
		System.out.println("�޸հ����� "+count);
		return 0;
	}

	@Override
	public List<UserVO> updateNotSleeperToSleeper(List<UserVO> list, int days) {
		Date d = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd",Locale.KOREA);
		String strToday = formatter.format(Calendar.getInstance().getTime());//���ó�¥ ����
		Date today = null;//���� ��¥
		Date visit = null;//�湮 ��¥
		try {
			for(int i=0; i<list.size(); ++i) {
				String strVistiAt = list.get(i).getVisitAt();
				today = formatter.parse(strToday);
				visit = formatter.parse(strVistiAt);
				long diffDays = (today.getTime()-visit.getTime())/(1000*60*60*24);
				if(diffDays >= days) {
					list.get(i).setSleeper(true);
				}
				else {
					list.get(i).setSleeper(false);
				}
				System.out.println("�̸� "+list.get(i).getUserName()+" �޸տ��� "+list.get(i).isSleeper());
			}
		} catch (ParseException e) {
			e.printStackTrace();//������ �����ϰڴ�
		}
		return list;
	}

	@Override
	public List<UserVO> updatePoint(List<UserVO> list, int point) {
		int max = 0;
		int temp = 0;
		for(int i=0; i<list.size(); ++i) {
			if(list.get(i).getPoint() > max) {
				max = list.get(i).getPoint();
				temp = i;
			}
		}
		System.out.println("����Ʈ ���� ���� ��� "+list.get(temp).getUserName()+list.get(temp).getUserNo());
		return list;
	}

	@Override
	public UserVO getPointRankerUser(List<UserVO> list) {
		for(int i=0; i<list.size(); ++i) {
			if(!list.get(i).isSleeper()) {
				list.get(i).setPoint(list.get(i).getPoint()+100);
			}
			System.out.println("����Ʈ "+list.get(i).getPoint());
		}
		return null;
	}

	@Override
	public List<UserVO> getPurchaseRankerUser(List<UserVO> list, ProductVO vo, int userNo) {
		double pulspoint = 0.05;
		for(int i=0; i<list.size(); ++i) {
			double totalpoint = vo.getPrice()*pulspoint;
			if(list.get(i).getUserNo() == userNo) {
				list.get(i).setPoint(list.get(i).getPoint()+(int)totalpoint);
				System.out.println("�̸� "+list.get(i).getUserName()+" ����Ʈ�ջ� "+list.get(i).getPoint());
			}
		}
		return list;
	}

}
