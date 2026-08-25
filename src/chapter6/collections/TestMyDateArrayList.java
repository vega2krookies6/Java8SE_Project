package chapter6.collections;

import java.util.ArrayList;
import java.util.List;

import chapter3.oop.MyDate;

public class TestMyDateArrayList {

	public static void main(String[] args) {
		//1. MyDate 타입의 객체만 담을 수 있는 ArrayList 객체를 생성하세요
		List<MyDate> list = new ArrayList<>();
		//2. fillArrayList() 메서드를 호출하세요
		fillArrayList(list);
		//3. printArrayList() 메서드를 호출하세요
		printArrayList(list);
	}
	public static void fillArrayList(List<MyDate> list) {
		list.add(new MyDate(2013,8,1));
		list.add(new MyDate(2013,9,2));
	}
	public static void printArrayList(List<MyDate> list) {
		for (MyDate myDate : list) {
			System.out.println(myDate.getYear() + "-"+myDate.getMonth()+"-"+myDate.getDay());
		}
	}

}
