package ��������;

import java.util.Arrays;

public class select {

	public static void main(String[] args) {
		//�迭 �̿��� �������� ����(�ٴ��ͼ�)
		
		int array[] = {9, 6, 7, 3, 5};
		//4ȸ��
		//1ȸ�� 4��üũ(�ּڰ��� ã��)
		boolean isChange = false; //ȸ�������Ǵ�
		int min = 0;
		int index =0;//�ּڰ� ��ġ
		for(int i=0; i<array.length-1;++i) {//4ȸ�� ����
			min = array[i];//0��¹ ���Ҹ� �ʱⰪ���� ����
			for(int j=i+1; j<array.length; ++j) {
				if(min > array[j]) {
					min = array[j];
					index = j;
					isChange = true;
				}
			}
		if(isChange) {
			int temp = array[i];
			array[i] = min;
			array[index] = temp;
		}
		if(!isChange) break;//�ּڰ��� ���ٰ� �Ǵ� ���ĵǾ� ���� break�� for�� �ߴ�
		}
		System.out.println(Arrays.toString(array));
		
		//�ּڰ� ���غ���
//		int min = array[0];
//		for(int i=1; i<array.length; ++i) {
//			������
//			if(min > array[i]) {
//				min = array[i];			
//			}
//		}
//		System.out.println(min);
	}
}
