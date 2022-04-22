package 선택정렬;

import java.util.Arrays;

public class select {

	public static void main(String[] args) {
		//배열 이용한 로직들은 경험(다다익선)
		
		int array[] = {9, 6, 7, 3, 5};
		//4회전
		//1회전 4번체크(최솟값을 찾자)
		boolean isChange = false; //회전여부판단
		int min = 0;
		int index =0;//최솟값 위치
		for(int i=0; i<array.length-1;++i) {//4회전 세팅
			min = array[i];//0번쨔 원소를 초기값으로 세팅
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
		if(!isChange) break;//최솟값이 없다고 판단 정렬되어 있음 break로 for문 중단
		}
		System.out.println(Arrays.toString(array));
		
		//최솟값 구해보기
//		int min = array[0];
//		for(int i=1; i<array.length; ++i) {
//			작으면
//			if(min > array[i]) {
//				min = array[i];			
//			}
//		}
//		System.out.println(min);
	}
}
