package chapter6.collections;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		addValues(list);
		printValues(list);
	}
	
	public static void  addValues(List<String> values) {
		values.add("고길동");
		values.add("둘리");
		values.add("희동이");
	}
	
	public static void printValues(List<String> values) {
		for(String value : values ) {
			System.out.println(value);
		}//for
	}
	
}
