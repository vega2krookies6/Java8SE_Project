package basic.step04_class;

/**
 * 4단계 : 객체 생성과 사용
 *
 * control 패키지의 테스트 클래스(BookDemo, StudentTest 등)와 같은 역할이다.
 */
public class ProductDemo {

	public static void main(String[] args) {

		// 1. 기본 생성자로 만든 뒤 setter 로 값을 채우는 방식
		Product p1 = new Product();
		p1.setName("무선 마우스");
		p1.setPrice(25000);
		p1.setStock(10);
		System.out.println(p1); // toString() 이 자동 호출된다.

		// 2. 생성자로 한 번에 값을 채우는 방식 (더 자주 쓰인다)
		Product p2 = new Product("기계식 키보드", 89000, 5);
		System.out.println(p2);

		// 3. 오버로딩된 생성자 (재고는 0)
		Product p3 = new Product("USB 허브", 15000);
		System.out.println(p3);

		// 4. setter 안의 검증이 동작하는지 확인
		p3.setPrice(-1000);
		System.out.println(p3);

		// 5. 메서드 호출로 상태 변경
		p3.addStock(20);
		boolean sold = p3.sell(3);
		System.out.println("판매 성공? " + sold + " / " + p3);
		System.out.println("재고보다 많이 판매? " + p3.sell(999));

		// 6. 참조형 변수는 "주소"를 담는다. 두 변수가 같은 객체를 가리킬 수 있다.
		Product alias = p2;
		alias.setPrice(79000);
		System.out.println("p2 도 함께 바뀐다 : " + p2);

		// 7. 객체 배열 : entity 여러 개를 묶어서 다룬다.
		Product[] products = { p1, p2, p3 };
		int total = 0;
		for (Product p : products) {
			System.out.println(" - " + p.getName() + " : " + p.getPrice() + "원");
			total += p.getPrice() * p.getStock();
		}
		System.out.printf("재고 자산 총액 : %,d원%n", total);

		// 8. 아무 객체도 가리키지 않는 참조는 null 이다.
		//    null 인 참조로 메서드를 호출하면 NullPointerException 이 발생한다.
		Product empty = null;
		if (empty != null) {
			System.out.println(empty.getName());
		} else {
			System.out.println("empty 는 아직 객체를 가리키지 않습니다.");
		}
	}
}
