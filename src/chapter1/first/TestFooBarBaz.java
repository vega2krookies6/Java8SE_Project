package chapter1.first;

public class TestFooBarBaz {
	final static int MAX_NUMBER = 20;
	
	public static void main(String[] args) {
		for(int i=1;i<=MAX_NUMBER;i++) {
			System.out.print(i);
			//3의배수
			if(i % 3 == 0) {
				System.out.print("\tfoo");
			}
			//4의 배수
			if(i % 4 == 0) {
				System.out.print("\tbar");
			}
			//6의 배수
			if(i % 6 == 0) {
				System.out.print("\tbaz");
			}			
			System.out.println("");
		}
	}
}
