package chapter1.first;

import java.util.Scanner;

public class MyCalculatorUsingScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//int Integer.parseInt(String str)
		int num1 = 0;
		int num2 = 0;
		
		while(true) {
			System.out.println("첫번째 숫자를 입력하세요!!");
			num1 = scan.nextInt();
			System.out.println("두번째 숫자를 입력하세요!!");
			num2 = scan.nextInt();
			break;
		}
		//3. 더하기 연산을 하는 메서드를 호출한다.
		System.out.println(num1 + " : " +  num2);
		int result = 0;
		result = add(num1, num2);
		System.out.println("더하기 연산 결과 : " + result);
		result = substract(num1, num2);
		System.out.println("빼기 연산 결과 : " + result);
		result = remainder(num1, num2);
		System.out.println("나머지 연산 결과 :" + result);
	}//main
	
	public static int add(int op1, int op2) {
		return op1 + op2;
	}
	public static int substract(int op1, int op2) {
		return op1 - op2;
	}
	public static int multiply(int op1, int op2) {
		return op1 * op2;
	}
	public static int divide(int op1, int op2) {
		return op1 / op2;
	}
	public static int remainder(int op1, int op2) {
		return op1 % op2;
	}
	
	

}
