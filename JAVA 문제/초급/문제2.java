1. x의 최종 결과 값은? 50
    int x = 100;
    if(x == 50){
        x = 0;
    }else{
        x = 50;
    }
    System.out.print("x의 최종값은 "+x);
    정답)
2. sum의 최종 결과 값은? 6
    int sum = 0;
    for(int i=0; i<=3; i++){
        sum += i;
    }
    System.out.print("sum의 최종값은 "+sum);
    정답)
3. sum의 최종 결과 값은? 13
    int array[] = {3,6,10};
    int sum = array[0] + array[2];
    System.out.print("sum의 최종값은 "+sum);
4. sum의 최종 결과 값은? 6
    int sum = 0;
    for(int i=0; i<=3; i++){
        if(i == 2){
            sum = i * 3;
        }
    }
    System.out.print("sum의 최종값은 "+sum);
5. sum의 최종 결과 값은? 6
    int sum = 0;
    for(int i=0; i<=3; i++){
        if(i == 2){
            sum = i * 3;
        }
    }
    System.out.print("sum의 최종값은 "+sum);
6. sum의 최종 결과 값은? 3
    int array[] = {10,20,30};
    int sum = 0;
    for(int i=0; i<3; i++){
       int x = array[i];
       if((x%10) == 0){
           ++sum;
       }
    }
    System.out.print("sum의 최종값은 "+sum);