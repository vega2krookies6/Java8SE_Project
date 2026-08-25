package chapter5.oop.printer;

public class LaserPrinter extends Printer {
	private double tonerCapacity;		//잉크의 용량
	private double tonerReductionRate;	//줄어드는 잉크의비율
	
	public LaserPrinter(String id) {
		//this.id = id;
		super(id);  //부모 클래스의 생성자를 호출함
		tonerCapacity = 200.0;
		tonerReductionRate = 0.3;
	}
	public LaserPrinter(String id, double tonerCapacity, double tonerReductionRate) {
		//this.id = id;
		this(id);  //같은 클래스내의 다른 생성자를 호출함
		this.tonerCapacity = tonerCapacity;
		this.tonerReductionRate = tonerReductionRate;
	}

	public double getTonerCapacity() {
		return tonerCapacity;
	}

	public double getTonerReductionRate() {
		return tonerReductionRate;
	}
	
	public void print(String msg) {
		if(isPrintable()) {
			System.out.println("레이저 방식으로 출력을 시작합니다.");
			System.out.println(msg);
			System.out.println("레이저방식으로 출력을 종료합니다.");
			tonerCapacity -= tonerReductionRate;
		}else 
			alert();
	}//print
	
	public boolean isPrintable() {
		return (tonerCapacity - tonerReductionRate) >= 0;
	}//isPrintable
	
	public void alert() {
		System.out.println("토너를 교체해야 합니다. 빨간 램프를 깜빡깜빡~~~");
	}//alert
	
	
}
