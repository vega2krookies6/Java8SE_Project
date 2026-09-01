package mylab.book.entity;

public class Publication {
    private String title;
    private String publishDate;
    private int page;
    private int price;
    
    // 기본 생성자
    public Publication() {
    }
    
    // 모든 멤버변수를 인자로 갖는 생성자
    public Publication(String title, String publishDate, int page, int price) {
        this.title = title;
        this.publishDate = publishDate;
        this.page = page;
        this.price = price;
    }
    
    // Getters and Setters
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getPublishDate() {
        return publishDate;
    }
    
    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }
    
    public int getPage() {
        return page;
    }
    
    public void setPage(int page) {
        this.page = page;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    
    // toString 메서드 오버라이드 - title만 반환
    @Override
    public String toString() {
        return title;
    }
}