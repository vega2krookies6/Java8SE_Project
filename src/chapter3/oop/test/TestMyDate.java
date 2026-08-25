package chapter3.oop.test;

import chapter3.oop.MyDate;

public class TestMyDate {

	public static void main(String[] args) {
		MyDate date3 = new MyDate(2013, 7, 24);
		System.out.println(date3);
		
		MyDate date = new MyDate();
		System.out.println(date.toString());
		
//		date.year = 2013;
//		date.month = 13;
//		date.day = 31;
//		System.out.println(date.year+"-"+date.month + "-"+date.day);
		//setter method 호출
		date.setYear(2013);
		date.setMonth(13);
		date.setDay(31);
		System.out.println(date.getYear()+"-"+date.getMonth()+"-"+date.getDay());
		
		MyDate date2 = new MyDate(2013,14,17);
		System.out.println(date2.getYear()+"-"+date2.getMonth()+"-"+date2.getDay());
		
	}

}
