package chapter1.first;

public class TestEvenOddNumber {


	public static void main(String[] args) {
		int evenNumberSum = 0;	//짝수
		int oddNumberSum = 0;	//홀수
		
		for (int i = 1; i <= 100; i++) {
			if(isEvenNumber(i)) {
				evenNumberSum += i;
			}else {
				oddNumberSum += i;
			}
			//짝수
//			if( i % 2 == 0 ) {
//				//evenNumberSum = evenNumberSum + i;
//				evenNumberSum += i;
//			}//if
//			//홀수
//			if ( i % 2 != 0) {
//				oddNumberSum += i;
//			}//if
		}//for
		System.out.println("짝수의 합 : " + evenNumberSum);
		System.out.println("홀수의 합 : " + oddNumberSum);
		
	}//main
	
	public static boolean isEvenNumber(int num) {
		boolean isEvenNumber = false;
		if(num % 2 == 0) {
			isEvenNumber = true;
		}
		return isEvenNumber;
	}
	
	
	
	
}//class
