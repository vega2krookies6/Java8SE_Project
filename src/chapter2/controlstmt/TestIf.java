package chapter2.controlstmt;

public class TestIf {


	public static void main(String[] args) {
		int num = 10;
		if(num > 0) {
			System.out.println("양수");
		}else {
			System.out.println("음수");
		}
		
		//삼항 연산자를 사용
		System.out.println(num > 0 ? "양수" : "음수");
		
		
	}//main

}//class
