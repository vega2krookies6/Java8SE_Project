package chapter1.first;

public class TestDataType {

	public static void main(String[] args) {
		short num1 = 128;
		short num2 = 20;
		short num3 = (short)(num1 + num2);
		System.out.println(num3);
		
		byte b = 127;  //byte -128 ~ 127 사이의 값
		b = (byte)num1;
		System.out.println(b);
		
		float pie = 3.14F;
		float pie2 = (float)3.14;
		System.out.println(pie + " : " + pie2);
		
		boolean isExist = true;
		System.out.println(!isExist);
		
		char ch = '\uac00';
		System.out.println(ch);
		ch = '\ub000';
		System.out.println(ch);
		
		long num4 = 3000000L * 3000000L * 3000000L;
		System.out.println(num4);
		
		long regNo =  7201052347538L;
		
		System.out.println('A'); //65
		System.out.println('B'); //66
		System.out.println('A' + 'B');
		System.out.println('1' + 2); //49
		
		long l = 1000L;
		int i = 2000;
		float f = 100.0F;
		f = l;
		System.out.println(f);
		f = i;
		System.out.println(f);
		
		//l = f;
		
		char ch1 = '\u0000';
		//ch1 = '';
		
		float result = 3/2F;
		System.out.println(result);
		
		float f2 = 0.1f;
		double d = 0.1;
		boolean result2 = (float)d==f2;
		System.out.println(result2);

		String str = "yes";
		//if(str == "yes") {
		if(str.equals("yes")) {
			System.out.println("YES");
		}
		String str2 = new String("no");
		//if(str2 == "no") {
		if(str2.equals("no")) {
			System.out.println("NO");
		}
		
		String str3 = "Yes";
		if(str3.equalsIgnoreCase("yes")) {
			System.out.println("문자열이 같다");
		}
				
		
	}

}





