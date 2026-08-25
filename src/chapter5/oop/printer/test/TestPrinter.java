package chapter5.oop.printer.test;

import chapter5.oop.printer.DotPrinter;
import chapter5.oop.printer.InkjetPrinter;
import chapter5.oop.printer.LaserPrinter;
import chapter5.oop.printer.Printer;

public class TestPrinter {


	public static void main(String[] args) {
		//1.각각의 3개의 Printer 객체를 생성하시오. (왼쪽과 오른쪽이 같도록)
		DotPrinter dot = new DotPrinter("100");
		InkjetPrinter inkjet = new InkjetPrinter("200");
		LaserPrinter laser = new LaserPrinter("300");
		//1-1각 객체의 print() 메서드를 호출한다.
		dot.print("Hello ");
		inkjet.print("Java");
		laser.print("choco");
		
		//2. 3개의 Printer 객체를 생성하시오 (왼쪽은 Printer 타입으로 )
		//One Interface, multiple Implementation (Polymorphism, 다형성)
		//Super 클래스의 타입의 변수에 Sub 객체를 생성하여 대입하는 것이 가능하다.
		Printer dot2 = new DotPrinter("101");
		Printer inkjet2 = new InkjetPrinter("102",100,0.5);
		//inkjet2 라는 변수가  InkjetPrinter 객체를 생성한 변수 인지를 체크
		if(inkjet2 instanceof InkjetPrinter) {
			InkjetPrinter ink = (InkjetPrinter)inkjet2;
			ink.getInkCapacity();
		}
		Printer laser2 = new LaserPrinter("103",100,0.2);
		
		//Printer 타입의 배열 생성
		Printer[] printers = new Printer[3];
		printers[0] = new DotPrinter("101");
		printers[1] = new InkjetPrinter("102",100,0.5);
		printers[2] = new LaserPrinter("103",100,0.2);
		
		String[] msg = {"Hello","Java","Choco"};
		
		for (int i = 0; i < printers.length; i++) {
			if(printers[i] instanceof InkjetPrinter) {
				InkjetPrinter inkjet3 = (InkjetPrinter)printers[i];
				System.out.println(">>>INKJET 프린터 "+inkjet3.getInkCapacity() + ": " + inkjet3.getInkReductionRate());
			}
			if(printers[i] instanceof LaserPrinter) {
				LaserPrinter laser3 = (LaserPrinter)printers[i];
				System.out.println(">>>LASER 프린터 " + laser3.getTonerCapacity() + " " + laser3.getTonerReductionRate());
			}
			printers[i].print(msg[i]);
		}
		
		
		
	}

}
