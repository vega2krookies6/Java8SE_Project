package basic.step04_class;

/**
 * 4단계 : 클래스와 객체, 캡슐화
 *
 * mylab.book.entity.Publication, workshop.person.entity.PersonEntity 와
 * 완전히 같은 구조의 entity 클래스다.
 *
 * entity 클래스의 5가지 구성 요소
 *   1) private 필드          - 데이터를 숨긴다(캡슐화)
 *   2) 기본 생성자
 *   3) 값을 받는 생성자      - 오버로딩
 *   4) getter / setter       - 통제된 접근 통로
 *   5) toString()            - 객체를 문자열로 표현
 */
public class Product {

	// 1) 필드는 private 으로 감춘다.
	private String name;
	private int price;
	private int stock;

	// 2) 기본 생성자
	//    다른 생성자를 하나라도 정의하면 기본 생성자는 자동으로 만들어지지 않으므로
	//    필요하다면 직접 선언해야 한다.
	public Product() {
	}

	// 3) 값을 받는 생성자 (생성자 오버로딩)
	public Product(String name, int price) {
		// this(...) 는 같은 클래스의 다른 생성자를 호출한다. 반드시 첫 줄이어야 한다.
		this(name, price, 0);
	}

	public Product(String name, int price, int stock) {
		// this.name 은 필드, name 은 매개변수 : 이름이 겹칠 때 this 로 구분한다.
		this.name = name;
		setPrice(price);   // 검증 로직이 있는 setter 를 재사용하는 것이 안전하다.
		this.stock = stock;
	}

	// 4) getter / setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	/**
	 * 가격을 설정한다. 음수는 허용하지 않는다.
	 * setter 안에 검증을 넣을 수 있다는 것이 필드를 private 으로 감추는 이유다.
	 */
	public void setPrice(int price) {
		if (price < 0) {
			System.out.println("가격은 0 이상이어야 합니다. 0으로 설정합니다.");
			this.price = 0;
			return;
		}
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	/** 재고를 늘린다. */
	public void addStock(int amount) {
		if (amount <= 0) {
			System.out.println("입고 수량은 양수여야 합니다.");
			return;
		}
		stock += amount;
	}

	/**
	 * 재고를 줄인다.
	 * @return 판매 성공 여부
	 */
	public boolean sell(int amount) {
		if (amount <= 0 || amount > stock) {
			return false;
		}
		stock -= amount;
		return true;
	}

	// 5) toString() : println(객체) 할 때 자동으로 호출된다.
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", stock=" + stock + "]";
	}
}
