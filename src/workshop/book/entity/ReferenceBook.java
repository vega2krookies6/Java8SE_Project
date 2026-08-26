package workshop.book.entity;

//참조서를  나타내는 자식 클래스
public class ReferenceBook extends Publication {
	//상속받은 속성이 아니라 ReferenceBook이 가지는 독자적인 속성임
	private String field;
	
	public ReferenceBook() {
		
	}

	public ReferenceBook(String title, String publishingDate, int page, int price, String field ) {
		super(title, publishingDate, page, price);
		this.field = field;
	}

	public String getField() {
		return field;
	}
	
	public void setField(String field) {
		this.field = field;
	}
}