1. 10 찾아내기.
문제설명
배열을 선언하고 10이 몇번째 인덱스에 있었는지 찾기 
제한사항
변수는 아래와 같이 선언.
배열안에 있는 값은 0초과 100미만 입니다.
10을 발견했으면 더이상 코드를 실행하지 않고 결과를 확인해야 합니다.
   int index = 0;
   int array[] = {30, 40, 50, 60, 10, 80};
입출력 예
4

내 답안
public static void main(String[] args) {
		int index = 0;
		   int array[] = {30, 40, 50, 60, 10, 80};
		   for(index=0; index<array.length; ++index) {
			  if(array[index]>0 && array[index]<100){
			  if(array[index]==10) {
					  break;
			  }
			  }
			  }
		   System.out.println(index);
			}
