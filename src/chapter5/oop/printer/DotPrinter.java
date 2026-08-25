package chapter5.oop.printer;

public class DotPrinter extends Printer  {
	public DotPrinter(String id) {
		//this.id = id;
		super(id);	//Printer 클래스의 생성자를 호출함
	}
	public void print(String msg) {
		if(isPrintable()) {
			System.out.println("도트 방식으로 출력을 시작합니다.");
			System.out.println(msg);
			System.out.println("도트방식으로 출력을 종료합니다.");
		}else 
			alert();
	}
	
	public boolean isPrintable() {
		return true;
	}
	
	public void alert() {
		System.out.println("");
	}
	
}
