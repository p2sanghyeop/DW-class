package ����¡;

public class PageHandler {

	public static void main(String[] args) {
		//���Ű��� ����¡
		//�߿��� �۰��� 210ȭ���� ������
		//step 1. �������� �˾Ƴ���(�� ī��Ʈ�� ������¡ ��� ���������� �߿�)
		int total = 219; //sql���� count
		//���̹� ���� ���� 1�������� 10�� �Խù��� �����ټ� �ִ�\
		//��� �������� ���ñ�?
		int pages = 0;
		int pageSize = 10;//1�������� �����ټ� �ִ� �Խù���
		pages = total/pageSize;
		if(total%pageSize >0)
			++pages;
		System.out.println("��������"+pages);
		System.out.println("���������� ������ �Խù���"+pageSize);
		//step 2. ��� �˾Ƴ���
		int navigatePage = 10; //�Ѻ�Ͽ� ���������� ��������
		int block = 0;
		block = pages/navigatePage;
		if(pages%navigatePage >0)
			++block;
		System.out.println("��ϼ�"+block);
		
		//step 3. ������ �˾Ƴ���
		int pageNum = 21;//����������
		int nowBlock = 0;
		nowBlock = (pageNum/navigatePage);
		if(pageNum % navigatePage > 0) {
			++nowBlock;
		}			
		System.out.println("������"+nowBlock);
		
		//step 4. ������ ��� �˾Ƴ���
		int lastBlock = 0;
		//hint : total, navigatePage, pageSize
		lastBlock = total/(navigatePage*pageSize);
		if(total%(navigatePage*pageSize) > 0) {
			++lastBlock;
		}
		System.out.println("���������"+lastBlock);
		
		//step 5. ���系�� ��ġ�� ����� ó���������� ������������ �����ϱ�
		//ex)1��� 1~10
		//	 2��� 11~20
		
		int startPage = 0;
		int lastPage = 0;
		//��Ʈ startPage�� ���� ����
		startPage = (nowBlock*navigatePage)-(navigatePage-1);
		lastPage = (nowBlock*navigatePage)/(startPage)-(navigatePage-1);
		if(nowBlock == lastBlock) {
			lastPage = pages;
		}
		
		System.out.println("����������"+startPage);
		System.out.println("������������"+lastPage);
		
		//step 6. ������ư ������ư ���� �Ǵ�
		boolean hasPreviousPage = true;//������ư
		boolean hasNextPage = true;//������ư
		
		if(lastBlock == 1) {
			hasPreviousPage = false;
			hasNextPage = false;
		}
		if(lastBlock > 1 && lastBlock == nowBlock) {
			hasPreviousPage = true;
			hasNextPage = false;
		}
		if(lastBlock > 1 && pageNum <= navigatePage) {
			hasPreviousPage = false;
			hasNextPage = true;
		}
		System.out.println("������ư�� ����??"+hasPreviousPage);
		System.out.println("������ư�� ����??"+hasNextPage);
	}

}
