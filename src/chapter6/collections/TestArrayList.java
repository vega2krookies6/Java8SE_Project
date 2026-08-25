package chapter6.collections;

import java.util.ArrayList;
import java.util.List;

import chapter3.oop.MyDate;

public class TestArrayList {


	public static void main(String[] args) {
		arrayList1_4();
		arrayList1_4_2();
		arrayList5_0();
		arrayList5_2();
		myDateArrayList();
	}//main
	
	public static void myDateArrayList() {
		//MyDate 타입의 객체만을 담을 수 있는 ArrayList 를 생성
		List<MyDate> list = new ArrayList<MyDate>();
		
		list.add(new MyDate(2013, 7, 23));
		list.add(new MyDate(2013, 8, 15));
		list.add(new MyDate(2013, 8, 26));
		
		for(MyDate mydate : list) {
			System.out.println(mydate.getYear()+"-"+mydate.getMonth()+"-"+mydate.getDay());
		}//for
		
	}
	
	
	public static void arrayList5_2() {
		//100 ~ 500 사이의 값을 가진 Integer 타입의 객체를 ArrayList 에 저장하세요
		// Enhanced For Loop 를 사용하세요
		List<Integer> list = new ArrayList<>();
		list.add(new Integer(100));
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		for(Integer value : list ) {
			System.out.println(value);
		}
		
	}
	
	public static void arrayList5_0() {
		//1. String 타입의 객체만 담을 수 있는 ArrayList 객체 생성
		ArrayList<String> list = new ArrayList<>();
		list.add("Java5");
		String val = list.get(0);
		System.out.println(val);
		//list.add(new Integer(100));
		//String 타입의 객체만 담을 수 있으므로, Integer 타입의 객체를 담으면 컴파일 에러가 발생함
		list.add("CSS3");
		list.add("JQuery");
		list.add("JavaScript");
		String value = null;
		for (int i = 0; i < list.size(); i++) {
			value = list.get(i);
		}
		System.out.println("forEach 시작");
		for(String val2 : list) {
			System.out.println(val2);
		}
		
		
	}
	public static void arrayList1_4_2() {
		//1. ArrayList 객체 생성
		//2. add() 사용
		//3. get(), size() 사용
	}
	
	//1.4 버전 기준
	public static void  arrayList1_4() {
		//1. ArrayList 객체 생성
		ArrayList list = new ArrayList();
		//2. add() 메서드를 이용해서 객체를 저장
		list.add(new String("Java"));
		System.out.println(list.size());
		String str = (String)list.get(0);
		System.out.println(str);
		list.add("JSP");
		list.add("JavaScript");
		list.add("Java");
		list.add("HTML5");
		//list.add(new Integer(100));  
		//String과 다른 Integer 타입을 add 하여도 컴파일 에러는 발생하지 않는다.
		//get 할때 String 타입으로 형변환을 하였다면 ClassCastException 인 런타임오류가 발생함
		
		String value = null;
		for(int i=0;i<list.size();i++) {
			value = (String)list.get(i);
			System.out.println(value);
		}
	}
	
	
}
