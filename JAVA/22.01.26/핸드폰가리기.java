public static String solution(String phone_number) {
		String x;
		String y;
		int COUNT = 4;
		String temp = "";
		int len = phone_number.length();
		x=phone_number.substring(0, len-COUNT);
		for(int i=0; i<x.length(); ++i) {
			temp += "*";
		}
		y=phone_number.substring(len-COUNT, len);
		String result = temp.concat(y);
		return result;
	}
	public static void main(String[] args) {
		String num = solution("027778888");
		System.out.println(num);
		
	}

