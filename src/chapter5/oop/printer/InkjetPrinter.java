package chapter5.oop.printer;

public class InkjetPrinter extends Printer {
	private double inkCapacity;		//잉크의 용량
	private double inkReductionRate;	//줄어드는 잉크의비율
	
	public InkjetPrinter(String id) {
		//this.id = id;
		super(id);
		inkCapacity = 100.0;
		inkReductionRate = 0.2;
	}
	public InkjetPrinter(String id, double inkCapacity, double inkReductionRate) {
		//this.id = id;
		this(id);
		this.inkCapacity = inkCapacity;
		this.inkReductionRate = inkReductionRate;
	}

	public double getInkCapacity() {
		return inkCapacity;
	}

	public double getInkReductionRate() {
		return inkReductionRate;
	}
	
	public void print(String msg) {
		if(isPrintable()) {
			System.out.println("잉크젯 방식으로 출력을 시작합니다.");
			System.out.println(msg);
			System.out.println("잉크젯방식으로 출력을 종료합니다.");
			inkCapacity -= inkReductionRate;
		}else 
			alert();
	}//print
	
	public boolean isPrintable() {
		return (inkCapacity - inkReductionRate) >= 0;
	}//isPrintable
	
	public void alert() {
		System.out.println("잉크가 부족합니다. 빨간 램프를 깜빡깜빡~~~");
	}//alert
	
	
}
