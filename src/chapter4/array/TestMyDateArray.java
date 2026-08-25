package chapter4.array;

import chapter3.oop.MyDate;

public class TestMyDateArray {

	public static void main(String[] args) {
		TestMyDateArray test = new TestMyDateArray();
		
		//1.MyDate 타입 배열선언 및 생성
		MyDate[] dates = new MyDate[3];
		//2. 배열 채우기
		test.fillArray(dates);
		
		System.out.println(dates[2].getMonth());
		//3. 배열 출력하기
		test.printArray(dates);
		
	}//main
	public void fillArray(MyDate[] dates) {
		dates[0] = new MyDate(2013, 7, 17);
		dates[1] = new MyDate(2014, 8, 1);
		dates[2] = new MyDate(2015, 9, 3);
	
	}
	public void printArray(MyDate[] dates) {
		//3.배열 출력
		MyDate date = null;
		for (int i = 0; i < dates.length; i++) {
			date = dates[i];
			System.out.println(date.getYear()+"-"+date.getMonth()+"-"+date.getDay());
		}
		
		for (MyDate myDate : dates) {
			System.out.println(myDate.getYear()+"-"+myDate.getMonth()+"-"+myDate.getDay());
		}	
	}

}









