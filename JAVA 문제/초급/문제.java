1. x의 최종 결과 값은?
    int x = 100;
    x = 50;
    if(x == 50){
        x = 0;
    }
    x = 100;
    System.out.print("x의 최종값은 "+x);
    정답) 100
2. x의 최종 결과 값은?
    int x = 30;
    x = ++x;
    x = ++x;
    System.out.print("x의 최종값은 "+x);
    정답) 32
3. x의 최종 결과 값은?
    int x = 10;
    if(x == 10){
       x = 5;
       if(x == 5){
           x = 10;
       }
    }
    System.out.print("x의 최종값은 "+x);
    정답) 10
4. 아래 코드는 오류가 있는 코드 입니다.
   왜 오류인지 서술하시오.
    if(3 == 3){
        int x = 5;
    }
    x = 10;
    정답) x가 if문 안에 있어서
    
5. 아래 코드는 오류가 2개 있는 코드 입니다.
   2개 오류을 찾아 그이유를 서술하시오.
    if(3 == 3){
        int x = 5

    정답) x가 if문 안에 있어서, }가 닫혀져 있지않다.
6. 아래 for문을 실행하면 i의 값을 차례대로 쓰시오.
    for(int i=0; i<2; ++i){
        System.out.println(i);
    }
    정답) 0, 1

7. 아래 for문을 실행하면 i의 값을 차례대로 쓰시오.
    int sum = 0;
    for(int i=0; i<3; ++i){
        sum = i;
    }
    if(sum > 0){
        sum = 10;
    }
    System.out.println(sum); 10, 10, 10
8. 아래 for문을 실행하면 최종 결과값은 무엇 일까요?a
    int sum = 0;
    for(int i=0; i<2; ++i){
        sum = sum + i;
    }
    System.out.println(sum);
    
   a) 1  
   b) 2 
   c) 3 
   d) 4
9. 아래 for문을 실행하면 최종 결과값은 무엇 일까요?b
    int cnt = 1;
    for(int i=0; i<3; ++i){
        if(i == 2){
            ++cnt;
        }
    }
    System.out.println(cnt);

   a) 1  
   b) 2 
   c) 3 
   d) 4
10. 아래 결과값을 선택하시오. abcd중 답 없음
    int array[] = {0,13,44,50};
    array[0] = 10;
    System.out.println(array[0]);

    a) 0
    b) 13
    c) 44
    d) 50
11. 아래 결과값을 선택하시오. a
    int array[] = {0,13,44,50};
    array[1] = array[0];
    System.out.println(array[1]);

    a) 0
    b) 13
    c) 44
    d) 50
12. 아래 결과값을 선택하시오. b
    int array[] = {0,13,44,50};
    int temp = 0;
    temp = array[1];
    array[1] = array[2];
    array[2] = temp;
    System.out.println(array[2]);

    a) 0
    b) 13
    c) 44
    d) 50
13. 아래 결과값을 선택하시오. c
    int array[] = {0,13,44,50};
    if(2 == 2){
        array[3] = array[2];
    }
    System.out.println(array[3]);

    a) 0
    b) 13
    c) 44
    d) 50
14. 아래 결과값을 선택하시오. a
    int array[] = {0,13,44,50};
    int x = array[2];
    x = array[0];
    System.out.println(x);

    a) 0
    b) 13
    c) 44
    d) 50
15. 메소드를 호출했을 때 결과값은? 
    public static int getSum(int x, int y){
        int result = x + y;
        if(result == 20){
            result = 30;
        }
        return result;
    }

    public static void main(String[] args) {
        int result = getSum(10,10);
        System.out.println(result);
    }

    정답)30
16. 메소드를 호출했을 때 결과값은? 
    public static int getSum(int x, int y){
        if(y == 0){
            return 0;
        }
        int result = x + y;
        return result;
    }

    public static void main(String[] args) {
        int result = getSum(10,0);
        System.out.println(result);
    }

    정답)0
17. 메소드를 호출했을 때 결과값은?
    public static int getSum(int x, int y){
        int result = x + y;
        return result;
    }

    public static void main(String[] args) {
        int result = getSum(10,10);
        result = 30;
        System.out.println(result);
    }

    정답)30