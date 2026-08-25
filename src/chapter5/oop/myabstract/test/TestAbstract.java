package chapter5.oop.myabstract.test;

import chapter5.oop.myabstract.BeerCan;
import chapter5.oop.myabstract.EmptyCan;

public class TestAbstract {

	public static void main(String[] args) {
		//EmptyCan can = new EmptyCan();
		/*
		 * Super 클래스 타입의 변수에 Sub 객체를 생성해서 대입할 수 있다.
		 */
		EmptyCan can = new BeerCan();
		
	}

}
