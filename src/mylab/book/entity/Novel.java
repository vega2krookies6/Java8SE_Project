package mylab.book.entity;

public class Novel extends Publication {
    private String author;
    private String genre;
    
    // 기본 생성자
    public Novel() {
    }
    
    // 모든 멤버변수를 인자로 갖는 생성자
    public Novel(String title, String publishDate, int page, int price, String author, String genre) {
        super(title, publishDate, page, price);
        this.author = author;
        this.genre = genre;
    }
    
    // Getters and Setters
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    // toString 메서드 오버라이드
    @Override
    public String toString() {
        return super.toString() + " [소설] 저자:" + author + ", 장르:" + genre + 
               ", " + getPage() + "쪽, " + getPrice() + "원, 출판일:" + getPublishDate();
    }
}