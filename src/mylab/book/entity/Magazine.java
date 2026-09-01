package mylab.book.entity;

public class Magazine extends Publication {
    private String publishPeriod;
    
    // 기본 생성자
    public Magazine() {
    }
    
    // 모든 멤버변수를 인자로 갖는 생성자
    public Magazine(String title, String publishDate, int page, int price, String publishPeriod) {
        super(title, publishDate, page, price);
        this.publishPeriod = publishPeriod;
    }
    
    // Getters and Setters
    public String getPublishPeriod() {
        return publishPeriod;
    }
    
    public void setPublishPeriod(String publishPeriod) {
        this.publishPeriod = publishPeriod;
    }
    
    // toString 메서드 오버라이드
    @Override
    public String toString() {
        return super.toString() + " [잡지] 발행주기:" + publishPeriod + 
               ", " + getPage() + "쪽, " + getPrice() + "원, 출판일:" + getPublishDate();
    }
}