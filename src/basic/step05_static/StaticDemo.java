package basic.step05_static;

/**
 * 5단계 : static 확인
 */
public class StaticDemo {

	public static void main(String[] args) {

		System.out.println("생성 전 총 개수 : " + Counter.getTotalCount());

		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();

		// id 는 객체마다 다르다.
		System.out.println("c1 = " + c1 + ", c2 = " + c2 + ", c3 = " + c3);

		// totalCount 는 클래스에 하나뿐이라 모든 객체가 같은 값을 본다.
		System.out.println("생성 후 총 개수 : " + Counter.getTotalCount());

		// static 메서드는 객체 없이 호출 (Bank.generateAccountNumber 와 같은 아이디어)
		System.out.println("계좌번호 예시 : " + Counter.makeCode("AC", 1000));

		// 우리가 늘 쓰던 것들도 사실 static 이다.
		System.out.println("Math.max   : " + Math.max(10, 20));
		System.out.println("Integer 변환: " + (Integer.parseInt("100") + 1));
		System.out.println("String 변환 : " + String.valueOf(3.14));

		// main 도 static 이다. 그래서 main 안에서 인스턴스 메서드를 쓰려면
		// 아래처럼 객체를 먼저 만들어야 한다. (PersonManagerArrayList 의 mgr 과 동일)
		StaticDemo demo = new StaticDemo();
		demo.hello();
	}

	/** 인스턴스 메서드 : 객체를 통해서만 호출 가능 */
	public void hello() {
		System.out.println("인스턴스 메서드가 호출되었습니다.");
	}
}
