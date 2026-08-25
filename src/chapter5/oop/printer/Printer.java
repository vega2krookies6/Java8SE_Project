package chapter5.oop.printer;
/*
 * 추상메서드를 1개 이상 가지고 있으면 반드시 클래스도 추상클래스이어야 한다.
 * 추상클래스는 일반메서드(concrete method)와 
 *   추상메서드(abstract method)를 둘 다 가질 수 있다.
 *  Printer p = new Printer(); (x)
 *  Printer p = new DotPrinter("100");
 *  Super 클래스에 선언된 추상 메서드는 Sub 클래스에서 
 *    반드시 오버라이딩(overriding) 해야 한다. 
 *  오버라이딩의 규칙
 *  1. 메서드명, 리턴타입, 아규먼트 갯수와타입이 반드시 같아야 한다. (메서드선언부는 같아야함)
 *  2. 구현(body)부의 내용은 다르다.
 */
public abstract class Printer {

	private String id;

	public Printer() {
		super();
	}
	
	public Printer(String id) {
		this.id = id;
	}

	//concrete method (body가 있는 메서드)
	public String getId() {
		return id;
	}
	
	//추상메서드 : body가 없고, 선언부만 있는 메서드, 미완성된 메서드
	public abstract void print(String msg);

}





