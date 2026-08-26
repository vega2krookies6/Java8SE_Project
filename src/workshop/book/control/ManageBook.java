package workshop.book.control;
import workshop.book.entity.Magazine;
import workshop.book.entity.Novel;
import workshop.book.entity.Publication;
import workshop.book.entity.ReferenceBook;

public class ManageBook {

	public static void main(String[] args) {
		Magazine pub1 = new Magazine(); 
		//Publication method
		pub1.getPage();
		pub1.getPrice();
		pub1.getPublishingDate();
		pub1.getTitle();
		//Magazine method
		pub1.getPublishingPeriod();
		
		//Poly(다양한) + morphism(변형)		
		Publication pub = new Magazine();
		//Publication method
		pub.getPage();
		pub.getPrice();
		pub.getPublishingDate();
		pub.getTitle();
		
//		Magazine mag = (Magazine)pub;
//		mag.getPublishingPeriod();
		((Magazine)pub).getPublishingPeriod();
		
		//Publication 타입 배열을 선언 및 생성 
		Publication[] pubs = new Publication[5];
		pubs[0] = new Magazine("마이크로소프트","2007-10-01",328,9900,"매월");
		pubs[1] = new Magazine("경영과컴퓨터","2007-10-03",316,9000,"매월");
		pubs[2] = new Novel("빠삐용","2007-07-01",396,9800,"베르나르베르베르","현대소설");
		pubs[3] = new Novel("남한산성","2007-04-14",383,11000,"김훈","대하소설");
		pubs[4] = new ReferenceBook("실용주의프로그래머","2007-01-14",496,25000,"소프트웨어공학");		
		
		for (Publication publication : pubs) {
			System.out.println(publication);
		}
		
		Publication pub2 = pubs[2];
		System.out.println("=== 가격변경 전 ===");
		System.out.println(pub2.getTitle() + " = " + pub2.getPrice());
		modifyPrice(pub2);
		
		System.out.println("=== 가격변경 후 ===");
		System.out.println(pub2.getTitle() + " = " + pub2.getPrice());
		
		for (Publication publication : pubs) {
			printSubInfo(publication);
		}
		
		//Magazine 객체생성
		//Magazine mz = new Magazine();
		//mz 변수로 호출 가능한 메서드는 5개
		//Publication pub = new Magazine();
		//pub 변수로 호출 가능한 메서드 4개
		
		//Novel 객체생성
		//Novel novel = new Novel();
		//Publication pub2 = new Novel();
				
	}//main
	
	//하위(Sub)클래스들이 단독으로 가지고 있는 정보를 출력하는 메서드
	public static void printSubInfo(Publication pub) {
		if (pub instanceof Magazine) {
			Magazine m = (Magazine)pub;
			System.out.println(m.getPublishingPeriod());
		}else if(pub instanceof Novel) {
			Novel n = (Novel)pub;
			System.out.println(n.getAuthor() + " " + n.getGenre());
		}else if(pub instanceof ReferenceBook) {
			ReferenceBook r = (ReferenceBook)pub;
			System.out.println(r.getField());
		}
	}
	
	
	//다형적 아규먼트(Polymorphic Argument)
	/*
	 * void modifyPrice(Magazine mag)
	 * void modifyPrice(Novel nov)
	 * void modifyPrice(ReferenceBook refBook)
	 */
	public static void modifyPrice(Publication pub) {
		double rate = 0.0;
		if(pub instanceof Magazine) {
			rate = 0.6; //40%
		}
		if(pub instanceof Novel) {
			rate = 0.8; //20%
		}
		if(pub instanceof ReferenceBook) {
			rate = 0.9; //10%
		}
		
		pub.setPrice((int)(pub.getPrice() * rate));		
		
	}  //Publication p = new Magazine();

	//Polymorphic Argument 개념을 적용하지 않고, 하위클래스 타입별로 메서드 정의
//	public void mPrice(Magazine m) {
//		
//	}
//	
//	public void mPrice(Novel n) {
//		
//	}
//	
//	public void mPrice(ReferenceBook r) {
//		
//	}

	
	
	

}