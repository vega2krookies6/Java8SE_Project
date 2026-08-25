package chapter1.first;

public class MyCalcurator {

	public static void main(String[] args) {
		//1. 아규먼트의 length 를 체크해서  length != 2 면  프로그램 종료
		if(args.length != 2) {
			System.out.println("아규먼트에 두개의 숫자를 입력해야 합니다.");
			System.exit(0);
		}
		//2. String 타입의 argument 2개를 int 타입으로 변환한다. 
		//int Integer.parseInt(String str)
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
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
