package chapter2.util;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		//1. Scanner 객체 생성
		//System.in : 키보드로 부터 받은 입력
		Scanner scan = new Scanner(System.in);
		int kor = 0;
		int math = 0;
		String name = null;
		do {
			System.out.println("이름을 입력하세요");
			name = scan.next();
			System.out.println("국어 점수를 입력하세요");
			kor = scan.nextInt();
			System.out.println("수학 점수를 입력하세요");
			math = scan.nextInt();
			break;
		}while(true);
		
		System.out.println("점수 :" + name + " " + kor  + "-" + math);
		
	}

}
