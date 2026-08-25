package chapter2.util;

public class TestRandomNumber {

	public static void main(String[] args) {
		int randomInt = 0;
		for(int i=0;i<10;i++) {
			randomInt = (int)(Math.random() * 100)+1;
			System.out.println(randomInt);
		}

	}

}
