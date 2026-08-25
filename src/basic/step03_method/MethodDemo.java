package basic.step03_method;

/**
 * 3단계 : 메서드
 *
 * 메서드 구조 : [접근제어자] [static] 반환타입 메서드명(매개변수) { ... return 값; }
 *
 * PersonManagerArrayList 가 static main 에서 객체를 만들어
 * non-static 메서드를 호출하는 이유를 여기서 이해한다.
 */
public class MethodDemo {

	public static void main(String[] args) {

		// 1. static 메서드는 객체 없이 클래스 이름으로 바로 호출한다.
		int sum = add(3, 5);
		System.out.println("add(3, 5) = " + sum);

		// 2. non-static(인스턴스) 메서드는 반드시 객체를 만들어야 호출할 수 있다.
		MethodDemo demo = new MethodDemo();
		demo.printGreeting("김하늘");

		// 3. 메서드 오버로딩 : 이름이 같아도 매개변수가 다르면 별개의 메서드
		System.out.println(discount(10000));
		System.out.println(discount(10000, 0.2));

		// 4. 반환값이 없으면 void
		printLine();

		// 5. 배열을 넘기면 "주소"가 전달되므로 메서드 안에서 원본이 바뀐다.
		int[] values = { 1, 2, 3 };
		doubleAll(values);
		for (int v : values) {
			System.out.print(v + " "); // 2 4 6
		}
		System.out.println();

		// 6. 기본형을 넘기면 "값"이 복사되므로 원본은 바뀌지 않는다.
		int number = 10;
		changeValue(number);
		System.out.println("number = " + number); // 여전히 10

		// 7. 가변인자
		System.out.println("총합 : " + sumAll(1, 2, 3, 4, 5));
	}

	/**
	 * 두 정수의 합을 반환한다.
	 * @param a 첫 번째 값
	 * @param b 두 번째 값
	 * @return 두 값의 합
	 */
	public static int add(int a, int b) {
		return a + b;
	}

	/** 인사말을 출력한다. (인스턴스 메서드) */
	public void printGreeting(String name) {
		System.out.println("안녕하세요, " + name + "님!");
	}

	/** 기본 할인율 10% 적용 */
	public static int discount(int price) {
		return discount(price, 0.1); // 오버로딩된 다른 메서드를 재사용
	}

	/** 지정한 할인율 적용 */
	public static int discount(int price, double rate) {
		return (int) (price * (1 - rate));
	}

	/** 구분선 출력 (반환값 없음) */
	public static void printLine() {
		System.out.println("========================");
	}

	/** 배열의 모든 원소를 2배로 만든다. (원본이 변경된다) */
	public static void doubleAll(int[] values) {
		for (int i = 0; i < values.length; i++) {
			values[i] *= 2;
		}
	}

	/** 기본형은 복사본이 전달되므로 호출한 쪽에는 영향이 없다. */
	public static void changeValue(int value) {
		value = 999;
	}

	/** 개수 제한 없이 정수를 받아 합을 구한다. (내부적으로 배열이다) */
	public static int sumAll(int... numbers) {
		int total = 0;
		for (int n : numbers) {
			total += n;
		}
		return total;
	}
}
