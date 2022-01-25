public static String solution(String[] seoul) {
		int index = 0;
		int len = seoul.length;
		if(len>=1 && len<=1000) {
			for(int i=0; i<len; ++i) {
				if (seoul[i].length()>=1 && seoul[i].length()<=20) {
					if (seoul[i].equals("Kim")){
						index=i;
					}
				}
				
			}
		}
		String answer = "";
		answer="김서방은"+Integer.toString(index)+"에있다";
        return answer;
    }

	
    public static void main(String[] args) {
        String array[] = {"Jane", "Kim"};
        String result = solution(array);
        System.out.println(result);
    }