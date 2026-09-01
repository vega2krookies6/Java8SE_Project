package mylab.book.entity;

public class ReferenceBook extends Publication {
    private String field;
    
    // 기본 생성자
    public ReferenceBook() {
    }
    
    // 모든 멤버변수를 인자로 갖는 생성자
    public ReferenceBook(String title, String publishDate, int page, int price, String field) {
        super(title, publishDate, page, price);
        this.field = field;
    }
    
    // Getters and Setters
    public String getField() {
        return field;
    }
    
    public void setField(String field) {
        this.field = field;
    }
    
    // toString 메서드 오버라이드
    @Override
    public String toString() {
        return super.toString() + " [참고서] 분야:" + field + 
               ", " + getPage() + "쪽, " + getPrice() + "원, 출판일:" + getPublishDate();
    }
}