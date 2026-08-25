package basic.step09_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * 9단계 : List (ArrayList)
 *
 * Bank, Library, ShoppingCart 가 모두 List 로 데이터를 보관한다.
 * 배열과 달리 크기가 자동으로 늘어나고 삭제도 쉽다.
 *
 * 선언 관례 : List<타입> 변수 = new ArrayList<>();
 *   → 왼쪽은 인터페이스, 오른쪽은 구현 클래스.
 *     나중에 LinkedList 로 바꿔도 나머지 코드를 고칠 필요가 없다.
 */
public class ListDemo {

	public static void main(String[] args) {

		// 1. 생성과 추가
		List<String> names = new ArrayList<>();
		names.add("이순호");
		names.add("김하늘");
		names.add("박영선");
		names.add(1, "정민서"); // 1번 위치에 끼워 넣기
		System.out.println(names);

		// 2. 크기 / 조회 / 포함 여부
		System.out.println("크기      : " + names.size());       // 배열은 length, List 는 size()
		System.out.println("첫 번째   : " + names.get(0));       // 배열은 [0], List 는 get(0)
		System.out.println("포함 여부 : " + names.contains("김하늘"));
		System.out.println("위치      : " + names.indexOf("김하늘"));
		System.out.println("비었는가  : " + names.isEmpty());

		// 3. 수정과 삭제
		names.set(0, "이순신");
		names.remove("박영선");  // 값으로 삭제
		names.remove(0);         // 인덱스로 삭제
		System.out.println(names);

		// 4. 순회 방법 3가지
		//    (1) 향상된 for : 가장 많이 쓴다.
		for (String name : names) {
			System.out.println("향상된 for : " + name);
		}
		//    (2) 인덱스 for : 인덱스가 필요할 때 (ShoppingCart.removeItem 참고)
		for (int i = 0; i < names.size(); i++) {
			System.out.println(i + " : " + names.get(i));
		}
		//    (3) Iterator : 순회 중 안전하게 삭제할 때
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String name = it.next();
			if (name.startsWith("정")) {
				it.remove(); // 향상된 for 안에서 remove 하면 예외가 발생한다.
			}
		}
		System.out.println("Iterator 삭제 후 : " + names);

		// 5. 정렬과 배열 변환
		List<String> cities = new ArrayList<>(Arrays.asList("서울", "부산", "인천", "광주"));
		Collections.sort(cities);
		System.out.println("정렬 : " + cities);
		Collections.reverse(cities);
		System.out.println("역순 : " + cities);

		// 6. 숫자 List 는 int 가 아니라 Integer(래퍼 클래스)를 담는다.
		//    int  <-> Integer 자동 변환을 오토박싱/언박싱이라고 한다.
		List<Integer> prices = new ArrayList<>();
		prices.add(9900);   // int 9900 → Integer 로 자동 박싱
		prices.add(11000);
		prices.add(25000);

		int total = 0;
		for (int price : prices) { // Integer → int 자동 언박싱
			total += price;
		}
		System.out.printf("합계 : %,d원 / 평균 : %,.1f원%n", total, (double) total / prices.size());

		// 7. 객체를 담는 List 가 실제 랩에서 쓰는 형태다.
		List<Product> cart = new ArrayList<>();
		cart.add(new Product("소설", 11000));
		cart.add(new Product("잡지", 9900));
		cart.add(new Product("참고서", 25000));

		int sum = 0;
		for (Product p : cart) {
			sum += p.getPrice();
		}
		System.out.println("장바구니 : " + cart);
		System.out.printf("장바구니 총액 : %,d원%n", sum);

		// 8. 조건에 맞는 것만 골라 새 List 로 반환하기 (Library.getAvailableBooks 패턴)
		List<Product> expensive = findOver(cart, 10000);
		System.out.println("1만원 초과 : " + expensive);
	}

	/** 지정 금액을 초과하는 상품만 골라 새 List 로 반환한다. */
	public static List<Product> findOver(List<Product> products, int price) {
		List<Product> result = new ArrayList<>();
		for (Product p : products) {
			if (p.getPrice() > price) {
				result.add(p);
			}
		}
		return result;
	}

	/** 예제용 간단 entity (내부에서만 사용) */
	static class Product {
		private String name;
		private int price;

		public Product(String name, int price) {
			this.name = name;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public int getPrice() {
			return price;
		}

		@Override
		public String toString() {
			return name + "(" + price + ")";
		}
	}
}
