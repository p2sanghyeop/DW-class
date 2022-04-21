package shopping;

import java.util.List;

public interface ShoppingServiceImpl {
	
	/**
	 * @param list
	 * @return List
	 * @date : 2022. 4. 21.
	 * @author : sangwon Hyun
	 * comment : ��� ȸ�� ��ȸ
	 */
	public List<UserVO> getUserList(List<UserVO> list);
	
	/**
	 * @param list
	 * @param word
	 * @return List
	 * @date : 2022. 4. 21.
	 * @author : sangwon Hyun
	 * comment : �̸����� ȸ�� ��ȸ
	 */
	public List<UserVO> getFindByName(List<UserVO> list, String word);
	
	/**
	 * @param list
	 * @return int
	 * @date : 2022. 4. 21.
	 * @author : sangwon Hyun
	 * comment : �޸� ���� �� ��ȸ
	 */
	public int getSleeperUserCount(List<UserVO> list);
	
	/**
	 * @param list
	 * @param days
	 * @return List
	 * @date : 2022. 4. 21.
	 * @author : sangwon Hyun
	 * comment : ��Ⱓ �������� �޸հ������� ����
	 */
	public List<UserVO> updateNotSleeperToSleeper(List<UserVO> list, int days);
	
	/**
	 * @param list
	 * @param point
	 * @return List
	 * @date : 2022. 4. 21.
	 * @author : sangwon Hyun
	 * comment : ����Ʈ ���� ����
	 */
	public List<UserVO> updatePoint(List<UserVO> list, int point);
	
	/**
	 * @param list
	 * @return UserVO
	 * @date : 2022. 4. 21.
	 * @author : sangwon Hyun
	 * comment : ����Ʈ�� ���� ���� ȸ�� ��ȸ
	 */
	public UserVO getPointRankerUser(List<UserVO> list);
	

	/**
	 * @param list
	 * @param userNo
	 * @param vo
	 * @return List
	 * @date : 2022. 4. 21.
	 * @author : sangwon Hyun
	 * comment : Ư�� ȸ�� ��ǰ����
	 */
	public List<UserVO> getPurchaseRankerUser (List<UserVO> list, ProductVO vo ,int userNo);
	
	

}