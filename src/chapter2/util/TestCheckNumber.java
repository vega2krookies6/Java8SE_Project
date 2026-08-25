package chapter2.util;

public class TestCheckNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		            //01234
		String str = "1234a67890";
		System.out.println(str.length());
		char ch = '\u0000';
		for(int i=0;i<str.length();i++) {
			ch = str.charAt(i);
			//숫자이면
			if( ch >= '0' &&  ch <= '9') {
				System.out.print(" true ");
			}else {
				System.out.print(" false ");
			}
			System.out.println(ch);
		}

	}

}
