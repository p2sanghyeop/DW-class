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
2. 가위바위보
//가위바위보를 해서 승리한 횟수를 찾아내자.
	//메소드와 변수는 아래와 같이 선언.
	//보자기는 주먹을 이길 수 있습니다.
	//가위는 보자기를 이길 수 있습니다.
	//무적은 주먹, 가위, 보자기를 모두 이깁니다.
	//count배열에 이긴 횟수를 대입해야합니다.
	//0번째 인덱스에는 보자기 승리 횟수가 오고, 1번째 인덱스에는 무적 승리 횟수가 옵니다.
	public static int[] getList(int array[]){
        int count[] = {0,0};
        for(int i=0; i<count.length; ++i) {
        	
        }
        String 가위바위보[] = {"보자기","무적"};
        return count;
   }
	 public static void main(String[] args){
	        String 가위바위보[] = {"주먹","주먹","주먹","가위","주먹"};
	        int 승리 [] = getList(가위바위보);
	        for(int i : 승리){
	            System.out.print(i+", ");
	        }
}