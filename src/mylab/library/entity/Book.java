package mylab.library.entity;
/**
 * 도서 정보를 담는 클래스
 * 캡슐화를 적용하여 모든 멤버 변수는 private으로 선언
 */
public class Book {
    private String title;
    private String author;
    private String isbn;
    private int publishYear;
    private boolean isAvailable;

    /**
     * 기본 생성자
     */
    public Book() {
        this.isAvailable = true; // 초기 생성 시 도서는 대출 가능 상태
    }

    /**
     * 모든 필드를 초기화하는 생성자
     */
    public Book(String title, String author, String isbn, int publishYear) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publishYear = publishYear;
        this.isAvailable = true; // 초기 생성 시 도서는 대출 가능 상태
    }

    /**
     * Getter와 Setter 메소드
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * 도서 대출 메소드
     * @return 대출 성공 여부
     */
    public boolean checkOut() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    /**
     * 도서 반납 메소드
     */
    public void returnBook() {
        isAvailable = true;
    }

    /**
     * 도서의 문자열 표현을 반환
     */
    @Override
    public String toString() {
        return "책 제목: " + title + 
               "\t저자: " + author + 
               "\tISBN: " + isbn + 
               "\t출판년도: " + publishYear + 
               "\t대출 가능 여부: " + (isAvailable ? "가능" : "대출 중");
    }
}