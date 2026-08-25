package chapter5.oop.myabstract;

public class BeerCan extends EmptyCan {

	@Override
	public void printContent() {
		System.out.println("흑맥주 입니다.");
	}

	@Override
	public void printName() {
		System.out.println("OB 맥주 입니다.");
	}
	
}
