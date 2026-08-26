package workshop.book.entity;

//잡지을 나타내는 자식 클래스
public class Magazine extends Publication{
	//상속받은 속성이 아니라 Magazine이 가지는 독자적인 속성임
	private String publishingPeriod;
	
	public Magazine() {
		
	}

	public Magazine(String title, String publishingDate, int page, int price, String publishingPeriod) {
		super(title, publishingDate, page, price);
		this.publishingPeriod = publishingPeriod;
	}
	
	public String getPublishingPeriod() {
		return publishingPeriod;
	}
	
	public void setPublishingPeriod(String publishingPeriod) {
		this.publishingPeriod = publishingPeriod;
	}
	
}